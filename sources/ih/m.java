package ih;

import android.graphics.Bitmap;
import com.assetgro.stockgro.ui.profile.self.ImageCropActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.b2;
import qu.f0;
import qu.r0;
import vu.u;

/* loaded from: classes.dex */
public final class m extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f20015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageCropActivity f20016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f20017c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ImageCropActivity imageCropActivity, Bitmap bitmap, yt.a aVar) {
        super(2, aVar);
        this.f20016b = imageCropActivity;
        this.f20017c = bitmap;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new m(this.f20016b, this.f20017c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f20015a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            Bitmap bitmap = this.f20017c;
            int i11 = ImageCropActivity.f10043k;
            ImageCropActivity imageCropActivity = this.f20016b;
            imageCropActivity.getClass();
            File file = new File(imageCropActivity.getApplicationContext().getFilesDir().toString(), UUID.randomUUID() + ".jpg");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            xu.e eVar = r0.f32255a;
            b2 b2Var = u.f38408a;
            l lVar = new l(imageCropActivity, file, null);
            this.f20015a = 1;
            if (yk.g.e0(b2Var, lVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
