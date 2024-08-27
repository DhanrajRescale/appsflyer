package ob;

import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.feature_social.presentation.feed.home.SocialHomeFeedV2ViewModel;
import e1.s;
import e1.x;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nb.m;
import nb.n;
import nb.p;
import nb.v;
import nb.w;
import vt.z;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialHomeFeedV2ViewModel f29902b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(SocialHomeFeedV2ViewModel socialHomeFeedV2ViewModel, int i10) {
        super(1);
        this.f29901a = i10;
        this.f29902b = socialHomeFeedV2ViewModel;
    }

    public final void a(gb.d subCategoryData) {
        int i10 = this.f29901a;
        SocialHomeFeedV2ViewModel socialHomeFeedV2ViewModel = this.f29902b;
        switch (i10) {
            case 1:
                Intrinsics.checkNotNullParameter(subCategoryData, "it");
                socialHomeFeedV2ViewModel.getClass();
                Intrinsics.checkNotNullParameter(subCategoryData, "subCategoryData");
                if (!WifiService.INSTANCE.getInstance().isOnline()) {
                    yk.g.H(u0.f(socialHomeFeedV2ViewModel), null, null, new v(socialHomeFeedV2ViewModel, null), 3);
                    return;
                }
                boolean f10 = subCategoryData.f();
                s sVar = socialHomeFeedV2ViewModel.f8821q;
                ArrayList arrayList = new ArrayList(z.k(sVar));
                ListIterator listIterator = sVar.listIterator();
                while (true) {
                    x xVar = (x) listIterator;
                    if (xVar.hasNext()) {
                        gb.b bVar = (gb.b) xVar.next();
                        ArrayList<gb.d> e10 = bVar.e();
                        ArrayList arrayList2 = new ArrayList(z.k(e10));
                        for (gb.d dVar : e10) {
                            if (Intrinsics.a(dVar.d(), subCategoryData.d())) {
                                dVar = gb.d.a(dVar, !f10);
                            }
                            arrayList2.add(dVar);
                        }
                        arrayList.add(gb.b.a(bVar, arrayList2));
                    } else {
                        socialHomeFeedV2ViewModel.j(new p(arrayList));
                        yk.g.H(u0.f(socialHomeFeedV2ViewModel), null, null, new w(socialHomeFeedV2ViewModel, subCategoryData, f10, null), 3);
                        return;
                    }
                }
            default:
                Intrinsics.checkNotNullParameter(subCategoryData, "it");
                socialHomeFeedV2ViewModel.getClass();
                Intrinsics.checkNotNullParameter(subCategoryData, "data");
                socialHomeFeedV2ViewModel.j(new m("FEED_STREAM_SUBCATEGORY", subCategoryData.d()));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f29901a) {
            case 0:
                gb.e data = (gb.e) obj;
                Intrinsics.checkNotNullParameter(data, "it");
                SocialHomeFeedV2ViewModel socialHomeFeedV2ViewModel = this.f29902b;
                socialHomeFeedV2ViewModel.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                String str = data.f17214d;
                if (str != null) {
                    socialHomeFeedV2ViewModel.j(new n(str, data.b()));
                }
                return Unit.f23355a;
            case 1:
                a((gb.d) obj);
                return Unit.f23355a;
            default:
                a((gb.d) obj);
                return Unit.f23355a;
        }
    }
}
