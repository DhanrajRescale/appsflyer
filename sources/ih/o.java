package ih;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.self.ImageCropActivity;
import com.assetgro.stockgro.ui.profile.self.ImageCropViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class o extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageCropActivity f20020b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(ImageCropActivity imageCropActivity, int i10) {
        super(1);
        this.f20019a = i10;
        this.f20020b = imageCropActivity;
    }

    public final void a(Boolean bool) {
        int i10 = this.f20019a;
        ImageCropActivity context = this.f20020b;
        switch (i10) {
            case 0:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    com.kaopiz.kprogresshud.f fVar = context.f17255c;
                    if (fVar != null) {
                        fVar.d();
                        return;
                    }
                    return;
                }
                com.kaopiz.kprogresshud.f fVar2 = context.f17255c;
                if (fVar2 != null) {
                    fVar2.b();
                    return;
                }
                return;
            default:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ImageCropViewModel imageCropViewModel = (ImageCropViewModel) context.x();
                    String value = String.valueOf(System.currentTimeMillis());
                    Intrinsics.checkNotNullParameter(value, "value");
                    imageCropViewModel.f9081d.setUserImageSignature(value);
                    context.setResult(-1);
                    context.finish();
                    return;
                }
                String text = context.getString(R.string.upload_failed);
                Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f20019a) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            default:
                a((Boolean) obj);
                return Unit.f23355a;
        }
    }
}
