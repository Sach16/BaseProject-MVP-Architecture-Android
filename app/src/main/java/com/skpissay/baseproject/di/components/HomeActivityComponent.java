package com.skpissay.baseproject.di.components;

import android.view.WindowManager;

import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.skpissay.baseproject.di.HomeActivityScope;
import com.skpissay.baseproject.di.modules.HomeActivityModule;
import com.skpissay.baseproject.rest.ApiInterface;
import com.skpissay.baseproject.screens.activities.HomeActivity;
import com.skpissay.baseproject.screens.ui.assist.ViewHolderFactory;
import com.skpissay.baseproject.utils.IntentHelper;
import com.skpissay.baseproject.utils.NetworkChangeReceiver;
import com.skpissay.baseproject.utils.NetworkUtil;
import com.skpissay.baseproject.utils.PreferenceUtil;

import dagger.Component;

/**
 * Created by skpissay on 02/10/17.
 */

@HomeActivityScope
@Component(modules = HomeActivityModule.class, dependencies = AppComponent.class)
public interface HomeActivityComponent {

    HomeActivity context();

    ApiInterface apiInterface();

    PreferenceUtil preferenceUtil();

    ColorGenerator colorGenerator();

    IntentHelper intentHelper();

    NetworkChangeReceiver networkChangeReceiver();

    NetworkUtil networkUtil();

    WindowManager.LayoutParams layoutParams();

    ViewHolderFactory viewHolderFactory();

    /*QuantityDialog quantityDialog();

    DistributorDialog distributorDialog();

    DistributorCartAdapter distributorCartAdapter();

    NavItemAdapter navItemAdapter();*/

    void inject(HomeActivity homeActivity);
}

