package fi;

import com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoPlayer f16127b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(VideoPlayer videoPlayer, yt.a aVar) {
        super(2, aVar);
        this.f16127b = videoPlayer;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f16127b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16126a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            this.f16126a = 1;
            if (VideoPlayer.a(this.f16127b, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
