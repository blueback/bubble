import React from 'react'
import { Row, Col, Icon, Menu, Dropdown } from 'antd'
import './index.less'
import { Link } from 'react-router'
const SubMenu = Menu.SubMenu;
const MenuItemGroup = Menu.ItemGroup;

export default class Header extends React.Component {
  constructor () {
    super()
  }

  handleClick () {

  }

  render () {
    const {user} = this.props
    return (
      <header id="header" className="clearfix">
        <div className="ant-row">
          <div className="ant-col-xs-24 ant-col-sm-7 ant-col-md-6 ant-col-lg-4">
            <i className="nav-phone-icon anticon anticon-menu">
            </i><a id="logo" href="#">
            <img alt="logo" src="https://t.alipayobjects.com/images/rmsweb/T1B9hfXcdvXXXXXXXX.svg"/>
              <span>Ant Design</span>
            </a>
          </div>

            <div className="nav  ant-col-xs-0 ant-col-sm-17 ant-col-md-18 ant-col-lg-20" style={{display: 'block'}}>
              <div id="search-box">
                <div className="ant-select ant-select-combobox ant-select-enabled">
                  <div className="ant-select-selection
            ant-select-selection--single" role="combobox" aria-autocomplete="list" aria-haspopup="true"
                       aria-expanded="false">
                    <div className="ant-select-selection__rendered">
                      <div unselectable="unselectable" className="ant-select-selection__placeholder"
                           style={{display: 'block'}}>搜索组件...
                      </div>
                      <ul>
                        <li className="ant-select-search ant-select-search--inline">
                          <div className="ant-select-search__field__wrap"><input value=""
                                                                             className="ant-select-search__field"/><span
                            className="ant-select-search__field__mirror"></span></div></li>
                        </ul>
                      </div>
                      <span className="ant-select-arrow" unselectable="unselectable"
                            ><b></b></span></div>
                  </div>
                </div>
                <ul className="ant-menu ant-menu-horizontal  ant-menu-light ant-menu-root" role="menu"
                    aria-activedescendant="" id="nav" tabindex="0">
                  <li className="ant-menu-item" role="menuitem" aria-selected="false"><a href="/"><span>首页</span></a></li>
                  <li className="ant-menu-item" role="menuitem" aria-selected="false"><a href="/docs/practice/cases"><span>实践</span></a>
                  </li>
                  <li className="ant-menu-item" role="menuitem" aria-selected="false"><a
                    href="/docs/pattern/navigation"><span>模式</span></a></li>
                  <li className="ant-menu-item-selected ant-menu-item" role="menuitem" aria-selected="true"><a
                    href="/docs/react/introduce"><span>组件</span></a></li>
                  <li className="ant-menu-item" role="menuitem" aria-selected="false"><a href="/docs/spec/introduce"><span>语言</span></a>
                  </li>
                  <li className="ant-menu-item" role="menuitem" aria-selected="false"><a
                    href="/docs/resource/download"><span>资源</span></a></li>
                </ul>
              </div>
            </div>
          </header>

      //      <div className='ant-layout-header'>
      //    <div class="ant-col-xs-24 ant-col-sm-7 ant-col-md-6 ant-col-lg-4">
      //      <i class="nav-phone-icon anticon anticon-menu"></i>
      //      <a id="logo" href="#">
      //        <img alt="logo" src="https://t.alipayobjects.com/images/rmsweb/T1B9hfXcdvXXXXXXXX.svg"/>
      //        <span>Ant Design</span>
      //      </a>
      //    </div>
      //    <Menu className="header-menu" onClick={this.handleClick}
      //  mode="horizontal">
      //    <SubMenu title={<span><Icon type="user" />{user.user}</span>}>
      //      <Menu.Item key="setting:1">选项1</Menu.Item>
      //      <Menu.Item key="setting:2">选项2</Menu.Item>
      //      <Menu.Divider />
      //      <Menu.Item key="setting:3">注销</Menu.Item>
      //    </SubMenu>
      //    <Menu.Item key="mail">
      //    <Icon type="question" />帮助
      //</Menu.Item>
      //</Menu>
      //</div>

    )
  }
}
