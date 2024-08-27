package wb;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import h2.t;
import h2.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f38912b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f38913c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f38914d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f38915e = new a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final a f38916f = new a(4);

    /* renamed from: g, reason: collision with root package name */
    public static final a f38917g = new a(5);

    /* renamed from: h, reason: collision with root package name */
    public static final a f38918h = new a(6);

    /* renamed from: i, reason: collision with root package name */
    public static final a f38919i = new a(7);

    /* renamed from: j, reason: collision with root package name */
    public static final a f38920j = new a(8);

    /* renamed from: k, reason: collision with root package name */
    public static final a f38921k = new a(9);

    /* renamed from: l, reason: collision with root package name */
    public static final a f38922l = new a(10);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38923a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(1);
        this.f38923a = i10;
    }

    public final void a(v semantics) {
        switch (this.f38923a) {
            case 0:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "viewMediaDocument");
                return;
            case 1:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "textMediaDocumentFileName");
                return;
            case 2:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "btnViewMediaImage");
                return;
            case 3:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "postMediaImage");
                return;
            case 4:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "viewMediaVideoPlayer");
                return;
            case 5:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "btnVideoPlayerThumbnailClick");
                return;
            case 6:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "imageThumbnail");
                return;
            case 7:
            default:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "imageYoutubeThumbnail");
                return;
            case 8:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "viewYoutubePlayerView");
                return;
            case 9:
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                t.e(semantics, "btnYoutubePlayerThumbnailClick");
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38923a) {
            case 0:
                a((v) obj);
                return Unit.f23355a;
            case 1:
                a((v) obj);
                return Unit.f23355a;
            case 2:
                a((v) obj);
                return Unit.f23355a;
            case 3:
                a((v) obj);
                return Unit.f23355a;
            case 4:
                a((v) obj);
                return Unit.f23355a;
            case 5:
                a((v) obj);
                return Unit.f23355a;
            case 6:
                a((v) obj);
                return Unit.f23355a;
            case 7:
                Context it = (Context) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                FrameLayout frameLayout = new FrameLayout(it);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return frameLayout;
            case 8:
                a((v) obj);
                return Unit.f23355a;
            case 9:
                a((v) obj);
                return Unit.f23355a;
            default:
                a((v) obj);
                return Unit.f23355a;
        }
    }
}
