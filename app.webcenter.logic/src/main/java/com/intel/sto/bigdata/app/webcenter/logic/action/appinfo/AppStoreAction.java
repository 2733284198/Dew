package com.intel.sto.bigdata.app.webcenter.logic.action.appinfo;

import com.intel.sto.bigdata.app.webcenter.logic.db.DBOperator;
import com.opensymphony.xwork2.ActionSupport;

public class AppStoreAction extends ActionSupport {
  public String name;
  public String path;
  public String executable;
  public String strategy;
  public String type;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getExecutable() {
    return executable;
  }

  public void setExecutable(String executable) {
    this.executable = executable;
  }

  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String execute() throws Exception {
    DBOperator operator = new DBOperator();
    operator.addNewApp(name, path, executable, strategy, type);
    return SUCCESS;
  }
}
