import React, { PropTypes } from 'react'
import { bindActionCreators } from 'redux'
import { connect } from 'react-redux'
import { Menu, Icon } from 'antd'
import { Link } from 'react-router'
import { getAllMenu, updateNavPath } from '../../actions/menu'

const SubMenu = Menu.SubMenu

const defaultProps = {
  items: [],
  currentIndex: 0
}

const propTypes = {
  items: PropTypes.array,
  currentIndex: PropTypes.number
}

class Sidebar extends React.Component {
  constructor (props) {
    super(props)

    this.menuClickHandle = this.menuClickHandle.bind(this);
  }

  componentDidMount () {
    this.props.getAllMenu()
  }

  menuClickHandle (item) {
    this.props.updateNavPath(item.keyPath, item.key);
    //this.setState({
    //  currentIndex: item.key,
    //});
  }

  render () {
    const { items } = this.props
    let openKey = []
    const menu = items.map((item) => {
      openKey.push('sub'+item.key);
      return (
        <SubMenu
          key={'sub'+item.key}
          title={<span><Icon type={item.icon} />{item.name}</span>}
        >
          {item.subSysMenus.map((node) => {
            return (
              <Menu.Item key={'menu'+node.key}>{node.name}</Menu.Item>
            )
          })}
        </SubMenu>
      )
    });
    return (
        <Menu theme="light"
          onClick={this.menuClickHandle}
          style={{ width: 240 }}
          defaultOpenKeys={['sub1']}
          // selectedKeys={[this.state.currentIndex]}
          mode="inline"
        >
          {menu}
        </Menu>

      //<aside className="ant-layout-sider">
      //
      //  <div className="ant-layout-logo"></div>
      //  <Menu
      //    mode="inline" theme="light" openKeys={openKey}
      //    onClick={this.menuClickHandle}
      //  >
      //    {menu}
      //  </Menu>
      //</aside>
    )
  }
}

Sidebar.propTypes = propTypes;
Sidebar.defaultProps = defaultProps;

function mapStateToProps(state) {

  return {
    items: state.menu.items,
    currentIndex: state.menu.currentIndex
  }
}

function mapDispatchToProps(dispatch) {
  return {
    getAllMenu: bindActionCreators(getAllMenu, dispatch),
    updateNavPath: bindActionCreators(updateNavPath, dispatch)
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(Sidebar)
