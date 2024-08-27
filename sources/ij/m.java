package ij;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.fragment.app.j0;
import java.io.File;
import java.net.URI;

/* loaded from: classes.dex */
public final class m extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f20077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DownloadManager f20078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f20079c;

    public m(long j10, DownloadManager downloadManager, j0 j0Var) {
        this.f20077a = j10;
        this.f20078b = downloadManager;
        this.f20079c = j0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Long l10;
        if (intent != null) {
            l10 = Long.valueOf(intent.getLongExtra("extra_download_id", -1L));
        } else {
            l10 = null;
        }
        if (l10 != null) {
            long longValue = l10.longValue();
            long j10 = this.f20077a;
            if (j10 == longValue) {
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(j10);
                Cursor query2 = this.f20078b.query(query);
                Activity activity = this.f20079c;
                if (query2 != null && query2.moveToFirst() && 8 == query2.getInt(query2.getColumnIndex("status"))) {
                    Uri d10 = FileProvider.d(activity, jr.h.r(activity.getApplicationContext().getPackageName(), ".pdfprovider"), new File(new URI(query2.getString(query2.getColumnIndex("local_uri")))));
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setDataAndType(d10, "application/pdf");
                    intent2.setFlags(1);
                    if (intent2.resolveActivity(activity.getPackageManager()) != null) {
                        activity.startActivity(intent2);
                    } else {
                        Toast.makeText(activity.getApplicationContext(), "No supported App found", 0).show();
                    }
                }
                if (query2 != null) {
                    query2.close();
                }
                activity.unregisterReceiver(this);
            }
        }
    }
}
