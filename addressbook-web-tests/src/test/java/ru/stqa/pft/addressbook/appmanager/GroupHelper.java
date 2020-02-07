package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {


  public GroupHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnToGroupPage(String s) {
    click(By.linkText(s));
  }

  public void submitGroupCreation(String submit) {
    click(By.name(submit));
  }

  public void fillGroupForm(GroupData groupData) {
    type("group_name", By.name("group_name"), groupData.getName());
    type(null, By.name("group_header"), groupData.getHeader());
    type(null, By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation(String s) {
    click(By.name(s));
  }

  public void deleteSelectedGroups(String delete) {
    click(By.name(delete));
  }

  public void selectGroup(String s) {
    click(By.name(s));
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification()  {
    click(By.name("update"));
  }
}
