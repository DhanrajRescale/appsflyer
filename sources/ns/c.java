package ns;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.LruCache;
import com.mixpanel.android.util.RemoteService$ServiceUnavailableException;
import el.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLSocketFactory;
import ll.e;
import ls.d0;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static b f29117e;

    /* renamed from: a, reason: collision with root package name */
    public final File f29118a;

    /* renamed from: b, reason: collision with root package name */
    public final e f29119b;

    /* renamed from: c, reason: collision with root package name */
    public final MessageDigest f29120c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f29121d;

    /* JADX WARN: Type inference failed for: r0v6, types: [android.util.LruCache, ns.b] */
    public c(Context context, String str) {
        MessageDigest messageDigest;
        String concat = "MixpanelAPI.Images.".concat(str);
        e eVar = new e(24);
        this.f29118a = context.getDir(concat, 0);
        this.f29119b = eVar;
        this.f29121d = d0.a(context);
        try {
            messageDigest = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException unused) {
            l.V0("MixpanelAPI.ImageStore", "Images won't be stored because this platform doesn't supply a SHA1 hash function");
            messageDigest = null;
        }
        this.f29120c = messageDigest;
        if (f29117e == null) {
            synchronized (c.class) {
                try {
                    if (f29117e == null) {
                        f29117e = new LruCache(((int) (Runtime.getRuntime().maxMemory() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE)) / this.f29121d.f25169u);
                    }
                } finally {
                }
            }
        }
    }

    public final Bitmap a(String str) {
        Bitmap bitmap;
        SSLSocketFactory sSLSocketFactory;
        Bitmap bitmap2;
        synchronized (f29117e) {
            bitmap = (Bitmap) f29117e.get(str);
        }
        if (bitmap == null) {
            File b10 = b(str);
            if (b10 == null || !b10.exists()) {
                try {
                    d0 d0Var = this.f29121d;
                    synchronized (d0Var) {
                        sSLSocketFactory = d0Var.D;
                    }
                    this.f29119b.getClass();
                    FileOutputStream fileOutputStream = null;
                    byte[] n10 = e.n(str, null, sSLSocketFactory);
                    if (n10 != null && b10 != null) {
                        try {
                            if (n10.length < 10000000) {
                                try {
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(b10);
                                    try {
                                        fileOutputStream2.write(n10);
                                        try {
                                            fileOutputStream2.close();
                                        } catch (IOException e10) {
                                            l.W0("MixpanelAPI.ImageStore", "Problem closing output file", e10);
                                        }
                                    } catch (FileNotFoundException e11) {
                                        e = e11;
                                        throw new Exception("It appears that ImageStore is misconfigured, or disk storage is unavailable- can't write to bitmap directory", e);
                                    } catch (IOException e12) {
                                        e = e12;
                                        throw new Exception("Can't store bitmap", e);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileOutputStream = fileOutputStream2;
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e13) {
                                                l.W0("MixpanelAPI.ImageStore", "Problem closing output file", e13);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                } catch (IOException e15) {
                                    e = e15;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (RemoteService$ServiceUnavailableException e16) {
                    throw new Exception("Couldn't download image due to service availability", e16);
                } catch (IOException e17) {
                    throw new Exception("Can't download bitmap", e17);
                }
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(b10.getAbsolutePath(), options);
            float f10 = options.outHeight * options.outWidth * 4.0f;
            Runtime runtime = Runtime.getRuntime();
            if (f10 <= ((float) runtime.maxMemory()) - ((float) (runtime.totalMemory() - runtime.freeMemory()))) {
                bitmap = BitmapFactory.decodeFile(b10.getAbsolutePath());
                if (bitmap != null) {
                    synchronized (f29117e) {
                        bitmap2 = (Bitmap) f29117e.get(str);
                    }
                    if (bitmap2 == null) {
                        synchronized (f29117e) {
                            f29117e.put(str, bitmap);
                        }
                    }
                } else {
                    b10.delete();
                    throw new Exception("Bitmap on disk can't be opened or was corrupt");
                }
            } else {
                throw new Exception("Do not have enough memory for the image");
            }
        }
        return bitmap;
    }

    public final File b(String str) {
        MessageDigest messageDigest = this.f29120c;
        if (messageDigest == null) {
            return null;
        }
        return new File(this.f29118a, "MP_IMG_" + Base64.encodeToString(messageDigest.digest(str.getBytes()), 10));
    }
}
