package ue;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.fragment.app.j0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q extends ok.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f37120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f37121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f37122f;

    public q(Context context, Context context2, j0 j0Var) {
        this.f37120d = context;
        this.f37121e = context2;
        this.f37122f = j0Var;
    }

    @Override // ok.g
    public final void a(Object obj) {
        Bitmap resource = (Bitmap) obj;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Context applicationContext = this.f37120d;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Context context = this.f37121e;
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(applicationContext.getFilesDir().toString(), System.currentTimeMillis() + ".jpg");
        Uri d10 = FileProvider.d(context, "com.assetgro.stockgro.prod.provider", file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            resource.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        if (d10 != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", d10);
            this.f37122f.startActivity(Intent.createChooser(intent, "Share Image"));
        }
    }
}
