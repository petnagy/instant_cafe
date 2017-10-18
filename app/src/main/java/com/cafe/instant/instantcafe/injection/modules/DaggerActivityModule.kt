package com.cafe.instant.instantcafe.injection.modules

import com.cafe.instant.instantcafe.injection.PerActivity
import com.cafe.instant.instantcafe.pages.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Peter_Istvan_Nagy on 2017-10-18.
 */
@Module
interface DaggerActivityModule {

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    fun contributeMainActivityInjector(): MainActivity
}