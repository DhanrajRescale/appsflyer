package sb;

import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import com.assetgro.stockgro.prod.R;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;

/* loaded from: classes.dex */
public final class n0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedStreamViewModel f34523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34524c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f34525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(FeedStreamViewModel feedStreamViewModel, String str, boolean z10, yt.a aVar) {
        super(2, aVar);
        this.f34523b = feedStreamViewModel;
        this.f34524c = str;
        this.f34525d = z10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new n0(this.f34523b, this.f34524c, this.f34525d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f34522a;
        boolean z10 = this.f34525d;
        String str = this.f34524c;
        FeedStreamViewModel feedStreamViewModel = this.f34523b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                this.f34522a = 1;
                obj = feedStreamViewModel.f8833n.changePostBookmarkStatus(str, !z10, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (!((v0) obj).f29302a.isSuccessful()) {
                feedStreamViewModel.l(str);
            } else if (z10) {
                ListIterator listIterator = feedStreamViewModel.f8838s.listIterator();
                while (true) {
                    e1.x xVar = (e1.x) listIterator;
                    if (xVar.hasNext()) {
                        obj2 = xVar.next();
                        if (Intrinsics.a(((hb.u) obj2).f18230a.f18224a, str)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                hb.u uVar = (hb.u) obj2;
                if (uVar != null) {
                    feedStreamViewModel.k(new q(uVar));
                }
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, feedStreamViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
