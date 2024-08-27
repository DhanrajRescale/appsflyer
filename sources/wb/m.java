package wb;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final class m extends rs.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f38966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f38967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f38968c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f38969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f38970e;

    public m(String str, Function2 function2, String str2, g1 g1Var, g1 g1Var2) {
        this.f38966a = str;
        this.f38967b = function2;
        this.f38968c = str2;
        this.f38969d = g1Var;
        this.f38970e = g1Var2;
    }

    @Override // rs.a
    public final void a(qs.e youTubePlayer, float f10) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        this.f38970e.setValue(Float.valueOf(f10));
    }

    @Override // rs.a
    public final void c(qs.e youTubePlayer) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        this.f38969d.setValue(youTubePlayer);
        ((us.g) youTubePlayer).b(((Number) this.f38970e.getValue()).floatValue(), this.f38966a);
        Function2 function2 = this.f38967b;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, this.f38968c);
        }
    }

    @Override // rs.a
    public final void d(qs.e youTubePlayer, qs.d state) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
        Intrinsics.checkNotNullParameter(state, "state");
        int ordinal = state.ordinal();
        if (ordinal != 2) {
            String str = this.f38968c;
            Function2 function2 = this.f38967b;
            if (ordinal != 3) {
                if (ordinal == 4 && function2 != null) {
                    function2.invoke(Boolean.FALSE, str);
                    return;
                }
                return;
            }
            if (function2 != null) {
                function2.invoke(Boolean.TRUE, str);
                return;
            }
            return;
        }
        this.f38970e.setValue(Float.valueOf(s0.g.f34069a));
    }
}
