package com.cafe.instant.instantcafe.injection.modules

import android.arch.lifecycle.LifecycleRegistry
import com.cafe.instant.instantcafe.injection.PerActivity
import com.cafe.instant.instantcafe.pages.main.MainActivity
import dagger.Module
import dagger.Provides

/**
 * Created by Peter_Istvan_Nagy on 2017-10-18.
 */
@Module
class MainActivityModule {

    @Provides
    @PerActivity
    internal fun provideLifeCycleRegistry(activity: MainActivity): LifecycleRegistry {
        return LifecycleRegistry(activity)
    }

}