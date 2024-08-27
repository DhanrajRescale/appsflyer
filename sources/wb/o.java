package wb;

import android.content.Context;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final class o extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f38977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f38979c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f38980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f38981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f38982f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f38983g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1 f38984h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g1 f38985i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, String str, Function2 function2, String str2, g1 g1Var, g1 g1Var2, Function0 function0, g1 g1Var3, g1 g1Var4) {
        super(1);
        this.f38977a = context;
        this.f38978b = str;
        this.f38979c = function2;
        this.f38980d = str2;
        this.f38981e = g1Var;
        this.f38982f = g1Var2;
        this.f38983g = function0;
        this.f38984h = g1Var3;
        this.f38985i = g1Var4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        ss.a aVar = new ss.a();
        aVar.a(1, "controls");
        aVar.a(1, "fs");
        ss.b playerOptions = new ss.b(aVar.f34766a);
        Context context = this.f38977a;
        Intrinsics.checkNotNullParameter(context, "context");
        YouTubePlayerView youTubePlayerView = new YouTubePlayerView(context, null, 0);
        String str = this.f38978b;
        Function2 function2 = this.f38979c;
        String str2 = this.f38980d;
        g1 g1Var = this.f38981e;
        g1 g1Var2 = this.f38982f;
        Function0 function0 = this.f38983g;
        g1 g1Var3 = this.f38984h;
        g1 g1Var4 = this.f38985i;
        youTubePlayerView.setEnableAutomaticInitialization(false);
        m youTubePlayerListener = new m(str, function2, str2, g1Var, g1Var2);
        Intrinsics.checkNotNullParameter(youTubePlayerListener, "youTubePlayerListener");
        Intrinsics.checkNotNullParameter(playerOptions, "playerOptions");
        if (!youTubePlayerView.enableAutomaticInitialization) {
            youTubePlayerView.f12118b.a(youTubePlayerListener, true, playerOptions);
            n fullscreenListener = new n(function0, g1Var3, g1Var4, function2, str2, g1Var);
            Intrinsics.checkNotNullParameter(fullscreenListener, "fullscreenListener");
            youTubePlayerView.f12117a.add(fullscreenListener);
            return youTubePlayerView;
        }
        throw new IllegalStateException("YouTubePlayerView: If you want to initialize this view manually, you need to set 'enableAutomaticInitialization' to false.");
    }
}
