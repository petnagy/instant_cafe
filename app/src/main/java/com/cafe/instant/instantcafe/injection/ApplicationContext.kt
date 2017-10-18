package com.cafe.instant.instantcafe.injection

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

import javax.inject.Qualifier

/**
 * Created by Peter_Istvan_Nagy on 2017-10-18.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
annotation class ApplicationContext