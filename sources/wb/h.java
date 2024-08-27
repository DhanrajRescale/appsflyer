package wb;

import androidx.lifecycle.t;
import com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer;
import kotlin.jvm.functions.Function2;
import t0.g1;
import t0.n0;

/* loaded from: classes.dex */
public final class h implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f38942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.r f38943c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f38944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f38945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f38946f;

    public /* synthetic */ h(t tVar, androidx.lifecycle.r rVar, Function2 function2, String str, g1 g1Var, int i10) {
        this.f38941a = i10;
        this.f38942b = tVar;
        this.f38943c = rVar;
        this.f38944d = function2;
        this.f38945e = str;
        this.f38946f = g1Var;
    }

    @Override // t0.n0
    public final void a() {
        int i10 = this.f38941a;
        g1 g1Var = this.f38946f;
        String str = this.f38945e;
        Function2 function2 = this.f38944d;
        androidx.lifecycle.r rVar = this.f38943c;
        t tVar = this.f38942b;
        switch (i10) {
            case 0:
                tVar.getLifecycle().c(rVar);
                if (function2 != null) {
                    function2.invoke(Boolean.FALSE, str);
                }
                VideoPlayer videoPlayer = (VideoPlayer) g1Var.getValue();
                if (videoPlayer != null) {
                    videoPlayer.j();
                }
                g1Var.setValue(null);
                return;
            default:
                tVar.getLifecycle().c(rVar);
                if (function2 != null) {
                    function2.invoke(Boolean.FALSE, str);
                }
                VideoPlayer videoPlayer2 = (VideoPlayer) g1Var.getValue();
                if (videoPlayer2 != null) {
                    videoPlayer2.j();
                }
                g1Var.setValue(null);
                return;
        }
    }
}
