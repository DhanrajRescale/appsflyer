package ej;

import ba.fl;
import com.assetgro.stockgro.data.model.MySubscriptionResponse;
import com.assetgro.stockgro.data.model.SubscriptionPackages;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionViewModel;
import com.assetgro.stockgro.ui.subscription.MySubscriptionFragment;
import com.assetgro.stockgro.ui.subscription.MySubscriptionViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MySubscriptionFragment f15457b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(MySubscriptionFragment mySubscriptionFragment, int i10) {
        super(1);
        this.f15456a = i10;
        this.f15457b = mySubscriptionFragment;
    }

    public final void a(kj.j jVar) {
        Pair pair;
        int i10 = this.f15456a;
        MySubscriptionFragment mySubscriptionFragment = this.f15457b;
        switch (i10) {
            case 1:
                if (jVar != null && (pair = (Pair) jVar.a()) != null) {
                    ManageSubscriptionViewModel H = mySubscriptionFragment.H();
                    H.getClass();
                    Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "<set-?>");
                    H.f10499r = HttpUrl.FRAGMENT_ENCODE_SET;
                    androidx.navigation.t h10 = q6.l.h(mySubscriptionFragment);
                    MySubscriptionResponse subscriptionData = (MySubscriptionResponse) pair.f23354b;
                    int intValue = ((Number) pair.f23353a).intValue();
                    Intrinsics.checkNotNullParameter(subscriptionData, "subscriptionData");
                    h10.o(new e(subscriptionData, intValue));
                    return;
                }
                return;
            default:
                Pair pair2 = (Pair) jVar.a();
                if (pair2 != null) {
                    ManageSubscriptionViewModel H2 = mySubscriptionFragment.H();
                    H2.getClass();
                    Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "<set-?>");
                    H2.f10499r = HttpUrl.FRAGMENT_ENCODE_SET;
                    mySubscriptionFragment.H().f10500s = false;
                    androidx.navigation.t h11 = q6.l.h(mySubscriptionFragment);
                    String packageId = (String) pair2.f23353a;
                    boolean booleanValue = ((Boolean) pair2.f23354b).booleanValue();
                    Intrinsics.checkNotNullParameter(packageId, "packageId");
                    h11.o(new d(packageId, booleanValue));
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f15456a;
        int i11 = 0;
        MySubscriptionFragment mySubscriptionFragment = this.f15457b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                gj.d dVar = mySubscriptionFragment.f10504g;
                if (dVar != null) {
                    dVar.u(list);
                    if (mySubscriptionFragment.H().f10496o) {
                        mySubscriptionFragment.H().f10496o = false;
                        ((MySubscriptionViewModel) mySubscriptionFragment.r()).h();
                    }
                    if (mySubscriptionFragment.H().f10500s) {
                        MySubscriptionViewModel mySubscriptionViewModel = (MySubscriptionViewModel) mySubscriptionFragment.r();
                        String planName = mySubscriptionFragment.H().f10499r;
                        Intrinsics.checkNotNullParameter(planName, "planName");
                        for (SubscriptionPackages subscriptionPackages : mySubscriptionViewModel.i().getPackages()) {
                            if (Intrinsics.a(subscriptionPackages.getTitle(), planName)) {
                                mySubscriptionViewModel.f10512t.setValue(new kj.j(new Pair(subscriptionPackages.getPackageId(), Boolean.FALSE)));
                            }
                        }
                    } else {
                        MySubscriptionViewModel mySubscriptionViewModel2 = (MySubscriptionViewModel) mySubscriptionFragment.r();
                        String planName2 = mySubscriptionFragment.H().f10499r;
                        Intrinsics.checkNotNullParameter(planName2, "planName");
                        for (Object obj2 : mySubscriptionViewModel2.i().getPackages()) {
                            int i12 = i11 + 1;
                            if (i11 >= 0) {
                                if (Intrinsics.a(((SubscriptionPackages) obj2).getTitle(), planName2)) {
                                    mySubscriptionViewModel2.f10510r.setValue(new kj.j(new Pair(Integer.valueOf(i11), mySubscriptionViewModel2.i())));
                                }
                                i11 = i12;
                            } else {
                                vt.y.j();
                                throw null;
                            }
                        }
                    }
                    return Unit.f23355a;
                }
                Intrinsics.k("subscriptionPlanOverviewAdapter");
                throw null;
            case 1:
                a((kj.j) obj);
                return Unit.f23355a;
            case 2:
                ((fl) mySubscriptionFragment.q()).f4722x.setRefreshing(false);
                return Unit.f23355a;
            default:
                a((kj.j) obj);
                return Unit.f23355a;
        }
    }
}
