package wb;

import com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import t0.g1;
import t0.l3;

/* loaded from: classes.dex */
public final class e extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l3 f38933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f38935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l3 l3Var, String str, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f38933a = l3Var;
        this.f38934b = str;
        this.f38935c = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new e(this.f38933a, this.f38934b, this.f38935c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        VideoPlayer videoPlayer;
        ut.p pVar;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        l3 l3Var = this.f38933a;
        if (l3Var != null && (pVar = (ut.p) l3Var.getValue()) != null) {
            str = (String) pVar.f37401b;
        } else {
            str = null;
        }
        if (!Intrinsics.a(str, this.f38934b) && (videoPlayer = (VideoPlayer) this.f38935c.getValue()) != null) {
            videoPlayer.i();
        }
        return Unit.f23355a;
    }
}
