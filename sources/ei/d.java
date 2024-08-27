package ei;

import android.view.View;
import androidx.lifecycle.v;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import com.assetgro.stockgro.ui.social.presentation.slider.ImagesItemViewModel;
import gd.o;
import kotlin.jvm.internal.Intrinsics;
import yk.g;

/* loaded from: classes.dex */
public final class d extends o {
    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        kq.e schedulerProvider = viewHolderComponent.f14246a.k();
        ct.a compositeDisposable = viewHolderComponent.f14246a.c();
        UserRepository userRepository = viewHolderComponent.f14246a.m();
        g.i(userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f17292v = new BaseItemViewModel(schedulerProvider, compositeDisposable);
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        ((ImagesItemViewModel) v()).f9075c.observe(this, new ch.c(25, new c(this)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
