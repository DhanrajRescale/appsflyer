package m0;

import android.content.Context;
import android.content.Intent;
import com.assetgro.stockgro.ui.social.presentation.video.YoutubeVideoFullScreenActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class u4 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26882c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f26885f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(Context context, String str, boolean z10, c.n nVar, t0.g1 g1Var) {
        super(0);
        this.f26880a = 1;
        this.f26882c = context;
        this.f26883d = str;
        this.f26881b = z10;
        this.f26884e = nVar;
        this.f26885f = g1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f26880a;
        Object obj = this.f26884e;
        boolean z10 = this.f26881b;
        Object obj2 = this.f26885f;
        Object obj3 = this.f26883d;
        Object obj4 = this.f26882c;
        switch (i10) {
            case 0:
                w4 w4Var = new w4((x4) obj4, (w.n) obj, z10, (Function1) obj2);
                w4Var.f27021c = (w2.b) obj3;
                return w4Var;
            default:
                Intent intent = new Intent((Context) obj4, (Class<?>) YoutubeVideoFullScreenActivity.class);
                intent.putExtra("YOUTUBE_VIDEO_URL", (String) obj3);
                intent.putExtra("YOUTUBE_VIDEO_ELAPSED_TIME", ((Number) ((t0.g1) obj2).getValue()).floatValue());
                intent.putExtra("YOUTUBE_VIDEO_IS_LANDSCAPE", z10);
                ((c.n) obj).a(intent);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(w2.b bVar, w.n nVar, Function1 function1, boolean z10) {
        super(0);
        x4 x4Var = x4.f27081a;
        this.f26880a = 0;
        this.f26882c = x4Var;
        this.f26883d = bVar;
        this.f26884e = nVar;
        this.f26885f = function1;
        this.f26881b = z10;
    }
}
