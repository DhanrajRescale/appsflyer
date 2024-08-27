package wb;

import com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import t0.g1;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f38961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f38962c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f38963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f38964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f38965f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(g1 g1Var, Function2 function2, String str, g1 g1Var2, g1 g1Var3, int i10) {
        super(0);
        this.f38960a = i10;
        this.f38961b = g1Var;
        this.f38962c = function2;
        this.f38963d = str;
        this.f38964e = g1Var2;
        this.f38965f = g1Var3;
    }

    public final void a() {
        int i10 = this.f38960a;
        String str = this.f38963d;
        Function2 function2 = this.f38962c;
        g1 g1Var = this.f38965f;
        g1 g1Var2 = this.f38961b;
        g1 g1Var3 = this.f38964e;
        switch (i10) {
            case 0:
                Boolean bool = Boolean.TRUE;
                g1Var3.setValue(bool);
                VideoPlayer videoPlayer = (VideoPlayer) g1Var2.getValue();
                if (videoPlayer != null) {
                    videoPlayer.k(((Number) g1Var.getValue()).longValue());
                }
                if (function2 != null) {
                    function2.invoke(bool, str);
                    return;
                }
                return;
            default:
                Boolean bool2 = Boolean.TRUE;
                g1Var3.setValue(bool2);
                VideoPlayer videoPlayer2 = (VideoPlayer) g1Var2.getValue();
                if (videoPlayer2 != null) {
                    videoPlayer2.k(((Number) g1Var.getValue()).longValue());
                }
                if (function2 != null) {
                    function2.invoke(bool2, str);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f38960a) {
            case 0:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
