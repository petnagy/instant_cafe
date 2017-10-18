package com.cafe.instant.instantcafe.injection.component

import android.content.Context
import com.cafe.instant.instantcafe.ProjectApplication
import com.cafe.instant.instantcafe.injection.ApplicationContext
import com.cafe.instant.instantcafe.injection.modules.DaggerActivityModule
import com.cafe.instant.instantcafe.injection.modules.DaggerApplicationModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by Peter_Istvan_Nagy on 2017-10-18.
 */
@Singleton
@Component(modules = arrayOf(AndroidSupportInjectionModule::class, DaggerApplicationModule::class, DaggerActivityModule::class))
interface ApplicationComponent : AndroidInjector<ProjectApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<ProjectApplication>()

    @ApplicationContext
    fun context(): Context

}