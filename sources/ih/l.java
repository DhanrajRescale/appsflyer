package ih;

import androidx.lifecycle.u0;
import com.assetgro.stockgro.ui.profile.self.ImageCropActivity;
import com.assetgro.stockgro.ui.profile.self.ImageCropViewModel;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import qu.h2;
import qu.r0;

/* loaded from: classes.dex */
public final class l extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageCropActivity f20013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f20014b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ImageCropActivity imageCropActivity, File file, yt.a aVar) {
        super(2, aVar);
        this.f20013a = imageCropActivity;
        this.f20014b = file;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new l(this.f20013a, this.f20014b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        ImageCropViewModel imageCropViewModel = (ImageCropViewModel) this.f20013a.x();
        File imageFile = this.f20014b;
        Intrinsics.checkNotNullParameter(imageFile, "imageFile");
        h2 h2Var = imageCropViewModel.f10045o;
        if (h2Var != null) {
            h2Var.a(null);
        }
        imageCropViewModel.f9084g.setValue(Boolean.TRUE);
        imageCropViewModel.f10045o = yk.g.H(u0.f(imageCropViewModel), r0.f32256b, null, new p(imageCropViewModel, imageFile, null), 2);
        return Unit.f23355a;
    }
}
