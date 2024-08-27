package z7;

import a8.i;
import ba.ij;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.feature_onboarding.presentation.login.intro.IntroFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.login.intro.IntroViewModel;
import com.assetgro.stockgro.ui.subscription.OtherSubscriptionPlansFragment;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import me.relex.circleindicator.CircleIndicator3;
import vt.p0;

/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42157a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f42158b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f42157a = i10;
        this.f42158b = obj;
    }

    @Override // a8.i
    public final void a(int i10) {
        int i11 = this.f42157a;
        Object obj = this.f42158b;
        switch (i11) {
            case 0:
                ((d) obj).b(false);
                return;
            case 1:
                try {
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        ((i) it.next()).a(i10);
                    }
                    return;
                } catch (ConcurrentModificationException e10) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
                }
            default:
                return;
        }
    }

    @Override // a8.i
    public final void b(int i10, float f10, int i11) {
        switch (this.f42157a) {
            case 1:
                try {
                    Iterator it = ((List) this.f42158b).iterator();
                    while (it.hasNext()) {
                        ((i) it.next()).b(i10, f10, i11);
                    }
                    return;
                } catch (ConcurrentModificationException e10) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
                }
            default:
                return;
        }
    }

    @Override // a8.i
    public final void c(int i10) {
        int i11 = this.f42157a;
        Object obj = this.f42158b;
        switch (i11) {
            case 0:
                ((d) obj).b(false);
                return;
            case 1:
                try {
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        ((i) it.next()).c(i10);
                    }
                    return;
                } catch (ConcurrentModificationException e10) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
                }
            case 2:
                IntroFragment introFragment = (IntroFragment) obj;
                if (!((IntroViewModel) introFragment.r()).f8722t) {
                    introFragment.x(new AnalyticEvent("app_onboarding_screen_tap", p0.f(new Pair("screen_index", String.valueOf(i10)))));
                    introFragment.A(new AnalyticEvent("app_onboarding_screen_tap", p0.f(new Pair("screen_index", String.valueOf(i10)))));
                }
                ((IntroViewModel) introFragment.r()).f8722t = false;
                return;
            case 3:
                ((ij) ((zc.i) obj).q()).f5050t.setSelectedItem(i10);
                return;
            case 4:
                OtherSubscriptionPlansFragment otherSubscriptionPlansFragment = (OtherSubscriptionPlansFragment) obj;
                ej.a aVar = otherSubscriptionPlansFragment.f10521i;
                ej.a aVar2 = ej.a.f15445a;
                if (aVar == aVar2) {
                    otherSubscriptionPlansFragment.f10521i = ej.a.f15446b;
                    OtherSubscriptionPlansFragment.H(otherSubscriptionPlansFragment, false, otherSubscriptionPlansFragment.I().f15490a.getPackages().get(i10).getTitle());
                    return;
                } else {
                    otherSubscriptionPlansFragment.f10521i = aVar2;
                    return;
                }
            default:
                CircleIndicator3 circleIndicator3 = (CircleIndicator3) obj;
                if (i10 != circleIndicator3.f42842j && circleIndicator3.f27730k.getAdapter() != null && circleIndicator3.f27730k.getAdapter().a() > 0) {
                    circleIndicator3.a(i10);
                    return;
                }
                return;
        }
    }

    public c() {
        this.f42157a = 1;
        this.f42158b = new ArrayList(3);
    }
}
