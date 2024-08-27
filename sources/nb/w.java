package nb;

import com.assetgro.stockgro.feature_social.presentation.feed.home.SocialHomeFeedV2ViewModel;
import e1.x;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;
import vt.z;

/* loaded from: classes.dex */
public final class w extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialHomeFeedV2ViewModel f28606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gb.d f28607c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f28608d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(SocialHomeFeedV2ViewModel socialHomeFeedV2ViewModel, gb.d dVar, boolean z10, yt.a aVar) {
        super(2, aVar);
        this.f28606b = socialHomeFeedV2ViewModel;
        this.f28607c = dVar;
        this.f28608d = z10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new w(this.f28606b, this.f28607c, this.f28608d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f28605a;
        boolean z10 = this.f28608d;
        gb.d dVar = this.f28607c;
        SocialHomeFeedV2ViewModel socialHomeFeedV2ViewModel = this.f28606b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f28605a = 1;
            obj = socialHomeFeedV2ViewModel.f8818n.subCategoryInteraction(dVar.d(), !z10, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (!((v0) obj).f29302a.isSuccessful()) {
            e1.s sVar = socialHomeFeedV2ViewModel.f8821q;
            ArrayList arrayList = new ArrayList(z.k(sVar));
            ListIterator listIterator = sVar.listIterator();
            while (true) {
                x xVar = (x) listIterator;
                if (!xVar.hasNext()) {
                    break;
                }
                gb.b bVar = (gb.b) xVar.next();
                ArrayList<gb.d> e10 = bVar.e();
                ArrayList arrayList2 = new ArrayList(z.k(e10));
                for (gb.d dVar2 : e10) {
                    if (Intrinsics.a(dVar2.d(), dVar.d())) {
                        dVar2 = gb.d.a(dVar2, z10);
                    }
                    arrayList2.add(dVar2);
                }
                arrayList.add(gb.b.a(bVar, arrayList2));
            }
            socialHomeFeedV2ViewModel.j(new p(arrayList));
        }
        return Unit.f23355a;
    }
}
