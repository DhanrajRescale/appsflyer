package nf;

import android.provider.Settings;
import com.assetgro.stockgro.ui.main.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.b2;
import qu.f0;
import qu.r0;

/* loaded from: classes.dex */
public final class e extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f28641b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MainActivity mainActivity, yt.a aVar) {
        super(2, aVar);
        this.f28641b = mainActivity;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new e(this.f28641b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f28640a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                de.d dVar = MainActivity.f9574r;
                MainActivity mainActivity = this.f28641b;
                String string = Settings.Secure.getString(mainActivity.getContentResolver(), "android_id");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                mainActivity.f9579n = new of.c(mainActivity.getApplicationContext(), new of.h(mainActivity.getApplicationContext(), new of.a(kj.a.f23206a, mainActivity.getPackageName(), string)));
                xu.e eVar = r0.f32255a;
                b2 b2Var = vu.u.f38408a;
                d dVar2 = new d(mainActivity, null);
                this.f28640a = 1;
                if (yk.g.e0(b2Var, dVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception unused) {
        }
        return Unit.f23355a;
    }
}
