/*
 * To the extent possible under law, Red Hat, Inc. has dedicated all copyright 
 * to this software to the public domain worldwide, pursuant to the CC0 Public 
 * Domain Dedication. This software is distributed without any warranty.  See 
 * <http://creativecommons.org/publicdomain/zero/1.0/>.
 */
package com.redhat.gss.logging;

import org.apache.log4j.Logger;

@javax.ejb.Singleton
@javax.ejb.Startup
public class TestEjb
{
  private Logger log4j = Logger.getLogger(this.getClass());

  @javax.annotation.PostConstruct
  public void test()
  {
    //This is normally quite pointless, but we're just testing.
    log4j.info(new Object());
  }
}
