package wb;

import android.content.Context;
import android.content.Intent;
import com.assetgro.stockgro.ui.social.presentation.video.VideoFullScreenActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f38958b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f38959c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Context context, String str, int i10) {
        super(0);
        this.f38957a = i10;
        this.f38958b = context;
        this.f38959c = str;
    }

    public final void a() {
        int i10 = this.f38957a;
        String str = this.f38959c;
        Context context = this.f38958b;
        switch (i10) {
            case 0:
                Intent intent = new Intent(context, (Class<?>) VideoFullScreenActivity.class);
                intent.putExtra("VIDEO_URL", str);
                context.startActivity(intent);
                return;
            default:
                Intent intent2 = new Intent(context, (Class<?>) VideoFullScreenActivity.class);
                intent2.putExtra("VIDEO_URL", str);
                context.startActivity(intent2);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f38957a) {
            case 0:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
