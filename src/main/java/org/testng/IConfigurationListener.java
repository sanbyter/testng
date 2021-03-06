package org.testng;

/**
 * Listener interface for events related to configuration methods.
 */
public interface IConfigurationListener extends ITestNGListener {

  /**
   * Invoked before a configuration method is invoked.
   */
  void beforeConfiguration(ITestResult tr);

  /**
   * Invoked whenever a configuration method succeeded.
   */
  void onConfigurationSuccess(ITestResult itr);

  /**
   * Invoked whenever a configuration method failed.
   */
  void onConfigurationFailure(ITestResult itr);

  /**
   * Invoked whenever a configuration method was skipped.
   */
  void onConfigurationSkip(ITestResult itr);
}
