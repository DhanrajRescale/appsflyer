package wb;

import android.content.Context;
import com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f38952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f38953c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f38954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f38955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f38956f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Context context, g1 g1Var, String str, Function0 function0, Function2 function2, int i10) {
        super(1);
        this.f38951a = i10;
        this.f38952b = context;
        this.f38953c = g1Var;
        this.f38954d = str;
        this.f38955e = function0;
        this.f38956f = function2;
    }

    public final VideoPlayer a(Context it) {
        Context context = this.f38952b;
        int i10 = this.f38951a;
        Function2 function2 = this.f38956f;
        Function0 function0 = this.f38955e;
        String str = this.f38954d;
        g1 g1Var = this.f38953c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                VideoPlayer videoPlayer = new VideoPlayer(context, null, 6);
                g1Var.setValue(videoPlayer);
                videoPlayer.h(str, false);
                videoPlayer.setOnVideoPlayerAction(new i(function0, function2, str, 0));
                return videoPlayer;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                VideoPlayer videoPlayer2 = new VideoPlayer(context, null, 6);
                g1Var.setValue(videoPlayer2);
                videoPlayer2.h(str, false);
                videoPlayer2.setOnVideoPlayerAction(new i(function0, function2, str, 1));
                return videoPlayer2;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f38951a) {
            case 0:
                return a((Context) obj);
            default:
                return a((Context) obj);
        }
    }
}
