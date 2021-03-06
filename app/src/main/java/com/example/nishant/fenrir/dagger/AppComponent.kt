package com.example.nishant.fenrir.dagger

import com.example.nishant.fenrir.screens.mainapp.MainAppViewModelFactory
import com.example.nishant.fenrir.screens.mainapp.events.eventfilter.eventfilterlist.EventFilterListViewModelFactory
import com.example.nishant.fenrir.screens.mainapp.events.eventfilter.eventfiltermenu.EventFilterMenuViewModelFactory
import com.example.nishant.fenrir.screens.mainapp.events.eventinfo.EventInfoViewModelFactory
import com.example.nishant.fenrir.screens.mainapp.events.eventlist.EventListViewModelFactory
import com.example.nishant.fenrir.screens.mainapp.login.general.GeneralLoginViewModelFactory
import com.example.nishant.fenrir.screens.mainapp.login.outstee.OutsteeLoginViewModelFactory
import com.example.nishant.fenrir.screens.mainapp.more.n2ovoting.N2OVotingViewModelFactory
import com.example.nishant.fenrir.screens.mainapp.more.notifications.NotificationsViewModelFactory
import com.example.nishant.fenrir.screens.mainapp.profile.ProfileViewModelFactory
import com.example.nishant.fenrir.screens.mainapp.profile.signedeventlist.SignedEventListViewModelFactory
import com.example.nishant.fenrir.screens.wallet.cart.CartViewModelFactory
import com.example.nishant.fenrir.screens.wallet.items.ItemsViewModelFactory
import com.example.nishant.fenrir.screens.wallet.items.addtocart.AddToCartViewModelFactory
import com.example.nishant.fenrir.screens.wallet.money.MoneyViewModelFactory
import com.example.nishant.fenrir.screens.wallet.money.addmoney.bitsian.AddMoneyBitsianViewModelFactory
import com.example.nishant.fenrir.screens.wallet.money.addmoney.outstee.AddMoneyOutsteeViewModelFactory
import com.example.nishant.fenrir.screens.wallet.money.getmoney.GetMoneyViewModelFactory
import com.example.nishant.fenrir.screens.wallet.money.sendmoney.SendMoneyViewModelFactory
import com.example.nishant.fenrir.screens.wallet.stalls.StallsViewModelFactory
import com.example.nishant.fenrir.screens.wallet.tracking.orderlist.OrderListViewModelFactory
import com.example.nishant.fenrir.screens.wallet.tracking.trackorder.TrackOrderViewModelFactory
import dagger.Component
import javax.inject.Singleton

@Singleton @Component(modules = [AppModule::class])
abstract class AppComponent {

    abstract fun inject(viewModelFactory: MainAppViewModelFactory)

    abstract fun inject(viewModelFactory: EventListViewModelFactory)

    abstract fun inject(viewModelFactory: EventInfoViewModelFactory)

    abstract fun inject(viewModelFactory: EventFilterMenuViewModelFactory)

    abstract fun inject(viewModelFactory: EventFilterListViewModelFactory)

    abstract fun inject(viewModelFactory: GeneralLoginViewModelFactory)

    abstract fun inject(viewModelFactory: OutsteeLoginViewModelFactory)

    abstract fun inject(viewModelFactory: N2OVotingViewModelFactory)

    abstract fun inject(viewModelFactory: NotificationsViewModelFactory)

    abstract fun inject(viewModelFactory: ProfileViewModelFactory)

    abstract fun inject(viewModelFactory: SignedEventListViewModelFactory)

    abstract fun inject(viewModelFactory: MoneyViewModelFactory)

    abstract fun inject(viewModelFactory: AddMoneyBitsianViewModelFactory)

    abstract fun inject(viewModelFactory: AddMoneyOutsteeViewModelFactory)

    abstract fun inject(viewModelFactory: GetMoneyViewModelFactory)

    abstract fun inject(viewModelFactory: SendMoneyViewModelFactory)

    abstract fun inject(viewModelFactory: StallsViewModelFactory)

    abstract fun inject(viewModelFactory: ItemsViewModelFactory)

    abstract fun inject(viewModelFactory: AddToCartViewModelFactory)

    abstract fun inject(viewModelFactory: CartViewModelFactory)

    abstract fun inject(viewModelFactory: OrderListViewModelFactory)

    abstract fun inject(viewModelFactory: TrackOrderViewModelFactory)
}