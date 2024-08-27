package of;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.android.vending.licensing.ILicensingService;
import com.assetgro.stockgro.ui.main.lvl.licensing.util.Base64DecoderException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.LinkedList;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class c implements ServiceConnection {

    /* renamed from: j, reason: collision with root package name */
    public static final SecureRandom f29979j = new SecureRandom();

    /* renamed from: a, reason: collision with root package name */
    public ILicensingService f29980a;

    /* renamed from: b, reason: collision with root package name */
    public final PublicKey f29981b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f29982c;

    /* renamed from: d, reason: collision with root package name */
    public final h f29983d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f29984e;

    /* renamed from: f, reason: collision with root package name */
    public final String f29985f;

    /* renamed from: g, reason: collision with root package name */
    public final String f29986g;

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f29987h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final LinkedList f29988i = new LinkedList();

    public c(Context context, h hVar) {
        String str;
        this.f29982c = context;
        this.f29983d = hVar;
        try {
            this.f29981b = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(pf.a.a("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA7hfUGb22KqZuqyzxl6vwjs1ZRT4BhbSsjnTPHPBhXkTd2RcGucETZSP8Zz1v8uZkeFOznir6JiyWhxCkVFpfEbf9iuThFwW7mItmU1zoN/WnQszrSxC3C0S64R7LiQnAyuizW8bWNMA+NbxHkAmdu/iUTE85Mlx+haJ0rMdqVRT7h+fOWT+MhBNcq8Bq+a4mrmyo9pphXXaRAztIegLxGRtqf8yWcmL2fYb37AVK5GB+jVSxlgObZQGhrtuFNaGq9Zh/Ut0B9d8IEEixUG74v8wRwmNxlKs9K+Hj9+k1C2BRkkcjJn37gd4swzkbHNRtEOOk7PbDMlkTqhvkIymLcQIDAQAB")));
            String packageName = context.getPackageName();
            this.f29985f = packageName;
            try {
                str = String.valueOf(context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("LicenseChecker", "Package not found. could not get version code.");
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            this.f29986g = str;
            HandlerThread handlerThread = new HandlerThread("background thread");
            handlerThread.start();
            this.f29984e = new Handler(handlerThread.getLooper());
        } catch (Base64DecoderException e10) {
            Log.e("LicenseChecker", "Could not decode from Base64.");
            throw new IllegalArgumentException(e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new RuntimeException(e11);
        } catch (InvalidKeySpecException e12) {
            Log.e("LicenseChecker", "Invalid key specification.");
            throw new IllegalArgumentException(e12);
        }
    }

    public static void a(c cVar, e eVar) {
        synchronized (cVar) {
            cVar.f29987h.remove(eVar);
            if (cVar.f29987h.isEmpty() && cVar.f29980a != null) {
                try {
                    cVar.f29982c.unbindService(cVar);
                } catch (IllegalArgumentException unused) {
                    Log.e("LicenseChecker", "Unable to unbind from licensing service (already unbound)");
                }
                cVar.f29980a = null;
            }
        }
    }

    public final synchronized void b(e eVar) {
        this.f29983d.b(291, null);
        if (this.f29983d.a()) {
            ((nj.a) eVar.f29990b).a();
        } else {
            ((nj.a) eVar.f29990b).b();
        }
    }

    public final void c() {
        while (true) {
            e eVar = (e) this.f29988i.poll();
            if (eVar != null) {
                try {
                    Log.i("LicenseChecker", "Calling checkLicense on service for " + eVar.f29992d);
                    this.f29980a.d((long) eVar.f29991c, eVar.f29992d, new b(this, eVar));
                    this.f29987h.add(eVar);
                } catch (RemoteException e10) {
                    Log.w("LicenseChecker", "RemoteException in checkLicense call.", e10);
                    b(eVar);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, com.android.vending.licensing.d] */
    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ILicensingService iLicensingService;
        int i10 = com.android.vending.licensing.e.f8382a;
        if (iBinder == null) {
            iLicensingService = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof ILicensingService)) {
                iLicensingService = (ILicensingService) queryLocalInterface;
            } else {
                ?? obj = new Object();
                obj.f8381a = iBinder;
                iLicensingService = obj;
            }
        }
        this.f29980a = iLicensingService;
        c();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.w("LicenseChecker", "Service unexpectedly disconnected.");
        this.f29980a = null;
    }
}
