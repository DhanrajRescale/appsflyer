package jf;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.home.stockgyan.gyan.StockGyanActivity;
import com.assetgro.stockgro.ui.redemption.offers.details.OfferDetailsActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends ok.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gd.b f21347e;

    public /* synthetic */ d(gd.b bVar, int i10) {
        this.f21346d = i10;
        this.f21347e = bVar;
    }

    @Override // ok.g
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f21346d) {
            case 0:
                i((Bitmap) obj);
                return;
            default:
                i((Bitmap) obj);
                return;
        }
    }

    public final void i(Bitmap resource) {
        int i10 = this.f21346d;
        gd.b bVar = this.f21347e;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(resource, "resource");
                StockGyanActivity stockGyanActivity = (StockGyanActivity) bVar;
                stockGyanActivity.getClass();
                File file = new File(stockGyanActivity.getApplicationContext().getFilesDir().toString(), System.currentTimeMillis() + ".jpg");
                Uri d10 = FileProvider.d(stockGyanActivity, "com.assetgro.stockgro.prod.provider", file);
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
                    stockGyanActivity.startActivity(Intent.createChooser(intent, "Share Image"));
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(resource, "resource");
                OfferDetailsActivity offerDetailsActivity = (OfferDetailsActivity) bVar;
                offerDetailsActivity.getClass();
                File file2 = new File(offerDetailsActivity.getApplicationContext().getFilesDir().toString(), System.currentTimeMillis() + ".jpg");
                Uri d11 = FileProvider.d(offerDetailsActivity, "com.assetgro.stockgro.prod.provider", file2);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                    resource.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream2);
                    fileOutputStream2.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
                if (d11 != null) {
                    Intent intent2 = new Intent("android.intent.action.SEND");
                    intent2.setType("image/*");
                    intent2.putExtra("android.intent.extra.STREAM", d11);
                    intent2.putExtra("android.intent.extra.TEXT", offerDetailsActivity.getString(R.string.text_redemption_share_template));
                    offerDetailsActivity.startActivity(Intent.createChooser(intent2, "Share Image"));
                    return;
                }
                return;
        }
    }
}
