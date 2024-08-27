package ih;

import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.profile.self.ImageCropViewModel;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class p extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f20021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageCropViewModel f20022b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f20023c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ImageCropViewModel imageCropViewModel, File file, yt.a aVar) {
        super(2, aVar);
        this.f20022b = imageCropViewModel;
        this.f20023c = file;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new p(this.f20022b, this.f20023c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f20021a;
        ImageCropViewModel imageCropViewModel = this.f20022b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                UserRepository userRepository = imageCropViewModel.f9081d;
                File file = this.f20023c;
                this.f20021a = 1;
                obj = userRepository.updateUserProfile(file, null, null, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((v0) obj).f29302a.isSuccessful()) {
                imageCropViewModel.f10044n.postValue(Boolean.TRUE);
            } else {
                imageCropViewModel.f10044n.postValue(Boolean.FALSE);
            }
        } catch (Exception e10) {
            imageCropViewModel.f10044n.postValue(Boolean.FALSE);
            e10.printStackTrace();
        }
        imageCropViewModel.f9084g.postValue(Boolean.FALSE);
        return Unit.f23355a;
    }
}
