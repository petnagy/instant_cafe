package com.cafe.instant.instantcafe.injection.modules

import android.content.Context
import com.cafe.instant.instantcafe.ProjectApplication
import com.cafe.instant.instantcafe.injection.ApplicationContext
import dagger.Module
import dagger.Provides

/**
 * Created by Peter_Istvan_Nagy on 2017-10-18.
 */
@Module
class DaggerApplicationModule {

    @Provides
    @ApplicationContext
    internal fun provideContext(application: ProjectApplication): Context {
        return application.applicationContext
    }

}