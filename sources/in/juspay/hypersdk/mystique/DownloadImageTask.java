package in.juspay.hypersdk.mystique;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import in.juspay.hypersdk.core.DuiCallback;

/* loaded from: classes2.dex */
public class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
    private static int downloadCount;
    private final BaseAdapter adapter;
    private final BitmapCache bitmapCache;
    private final Context context;
    private final DuiCallback duiCallback;
    private String imageUrl;
    boolean isTriggerNotify;
    private final Integer palceHolder;

    public DownloadImageTask(BaseAdapter baseAdapter, Integer num, Context context, BitmapCache bitmapCache, DuiCallback duiCallback, ImageView imageView) {
        this.adapter = baseAdapter;
        this.palceHolder = num;
        this.context = context;
        this.bitmapCache = bitmapCache;
        this.duiCallback = duiCallback;
        int i10 = downloadCount;
        if (i10 == 0) {
            this.isTriggerNotify = true;
        } else {
            this.isTriggerNotify = false;
        }
        int i11 = i10 + 1;
        downloadCount = i11;
        downloadCount = i11 % 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Bitmap getImage(java.lang.String r5) {
        /*
            r4 = this;
            in.juspay.hypersdk.mystique.BitmapCache r0 = r4.bitmapCache
            android.graphics.Bitmap r0 = r0.get(r5)
            r1 = 0
            if (r0 != 0) goto L62
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.net.URLConnection r5 = r0.openConnection()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.lang.Object r5 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r5)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.net.URLConnection r5 = (java.net.URLConnection) r5     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r0 = 1
            r5.setDoInput(r0)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L33
            r5.connect()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L33
            java.io.InputStream r0 = r5.getInputStream()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L33
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L33
            r5.disconnect()
            return r0
        L2d:
            r0 = move-exception
            r1 = r5
            goto L5c
        L30:
            r0 = move-exception
            goto L5c
        L32:
            r5 = r1
        L33:
            android.content.Context r0 = r4.context     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L49
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L49
            java.lang.Integer r2 = r4.palceHolder     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L49
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L49
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r2)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L49
            if (r5 == 0) goto L48
            r5.disconnect()
        L48:
            return r0
        L49:
            in.juspay.hypersdk.core.DuiCallback r0 = r4.duiCallback     // Catch: java.lang.Throwable -> L2d
            in.juspay.hypersdk.core.DuiLogger r0 = r0.getLogger()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "IMG_ERR"
            java.lang.String r3 = "Not able to apply placeholder"
            r0.e(r2, r3)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L62
            r5.disconnect()
            goto L62
        L5c:
            if (r1 == 0) goto L61
            r1.disconnect()
        L61:
            throw r0
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.mystique.DownloadImageTask.getImage(java.lang.String):android.graphics.Bitmap");
    }

    @Override // android.os.AsyncTask
    public Bitmap doInBackground(String... strArr) {
        String str = strArr[0];
        this.imageUrl = str;
        return getImage(str);
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Bitmap bitmap) {
        super.onPostExecute((DownloadImageTask) bitmap);
        if (bitmap != null) {
            this.bitmapCache.put(this.imageUrl, bitmap);
            BaseAdapter baseAdapter = this.adapter;
            if (baseAdapter == null) {
                this.duiCallback.getLogger().e("IMG_ERR", "Fetching image from url failed. Null adapter passed");
            } else if (this.isTriggerNotify) {
                baseAdapter.notifyDataSetChanged();
            }
        }
    }
}
