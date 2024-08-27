package pd;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import com.assetgro.stockgro.data.enums.GroupImageType;
import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final class c0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupCreateViewModel f30863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f30864c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f30865d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(GroupCreateViewModel groupCreateViewModel, Context context, g1 g1Var, int i10) {
        super(1);
        this.f30862a = i10;
        this.f30863b = groupCreateViewModel;
        this.f30864c = context;
        this.f30865d = g1Var;
    }

    public final void a(Uri uri) {
        int i10 = this.f30862a;
        Context context = this.f30864c;
        GroupCreateViewModel groupCreateViewModel = this.f30863b;
        g1 g1Var = this.f30865d;
        switch (i10) {
            case 0:
                if (uri != null) {
                    g1Var.setValue(uri);
                    GroupImageType groupImageType = GroupImageType.Cover;
                    groupCreateViewModel.h(groupImageType);
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
                    ContextWrapper contextWrapper = new ContextWrapper(context);
                    Intrinsics.c(bitmap);
                    File d10 = vl.b.d(contextWrapper, bitmap);
                    groupCreateViewModel.A = d10;
                    groupCreateViewModel.i(d10, groupImageType);
                    return;
                }
                return;
            default:
                if (uri != null) {
                    g1Var.setValue(uri);
                    GroupImageType groupImageType2 = GroupImageType.Display;
                    groupCreateViewModel.h(groupImageType2);
                    Bitmap bitmap2 = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
                    ContextWrapper contextWrapper2 = new ContextWrapper(context);
                    Intrinsics.c(bitmap2);
                    File d11 = vl.b.d(contextWrapper2, bitmap2);
                    groupCreateViewModel.A = d11;
                    groupCreateViewModel.i(d11, groupImageType2);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f30862a) {
            case 0:
                a((Uri) obj);
                return Unit.f23355a;
            default:
                a((Uri) obj);
                return Unit.f23355a;
        }
    }
}
