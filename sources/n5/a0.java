package n5;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import j5.d0;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a0 implements w {

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.firebase.messaging.m f28238d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final UUID f28239a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaDrm f28240b;

    /* renamed from: c, reason: collision with root package name */
    public int f28241c;

    public a0(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = b5.l.f3400b;
        yk.j.F0(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f28239a = uuid;
        MediaDrm mediaDrm = new MediaDrm((e5.x.f15050a >= 27 || !b5.l.f3401c.equals(uuid)) ? uuid : uuid2);
        this.f28240b = mediaDrm;
        this.f28241c = 1;
        if (b5.l.f3402d.equals(uuid) && "ASUS_Z00AD".equals(e5.x.f15053d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // n5.w
    public final boolean A(String str, byte[] bArr) {
        if (e5.x.f15050a >= 31) {
            return z.a(this.f28240b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f28239a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // n5.w
    public final Map c(byte[] bArr) {
        return this.f28240b.queryKeyStatus(bArr);
    }

    @Override // n5.w
    public final v f() {
        MediaDrm.ProvisionRequest provisionRequest = this.f28240b.getProvisionRequest();
        return new v(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // n5.w
    public final void j(final t9.c cVar) {
        this.f28240b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: n5.y
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                a0 a0Var = a0.this;
                t9.c cVar2 = cVar;
                a0Var.getClass();
                e eVar = ((g) cVar2.f35633b).f28305y;
                eVar.getClass();
                eVar.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override // n5.w
    public final void l(byte[] bArr, d0 d0Var) {
        if (e5.x.f15050a >= 31) {
            try {
                z.b(this.f28240b, bArr, d0Var);
            } catch (UnsupportedOperationException unused) {
                e5.m.f("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // n5.w
    public final h5.b m(byte[] bArr) {
        boolean z10;
        int i10 = e5.x.f15050a;
        UUID uuid = this.f28239a;
        if (i10 < 21 && b5.l.f3402d.equals(uuid) && "L3".equals(this.f28240b.getPropertyString("securityLevel"))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 < 27 && b5.l.f3401c.equals(uuid)) {
            uuid = b5.l.f3400b;
        }
        return new x(uuid, bArr, z10);
    }

    @Override // n5.w
    public final byte[] n() {
        return this.f28240b.openSession();
    }

    @Override // n5.w
    public final void o(byte[] bArr, byte[] bArr2) {
        this.f28240b.restoreKeys(bArr, bArr2);
    }

    @Override // n5.w
    public final void q(byte[] bArr) {
        this.f28240b.closeSession(bArr);
    }

    @Override // n5.w
    public final synchronized void release() {
        int i10 = this.f28241c - 1;
        this.f28241c = i10;
        if (i10 == 0) {
            this.f28240b.release();
        }
    }

    @Override // n5.w
    public final byte[] s(byte[] bArr, byte[] bArr2) {
        if (b5.l.f3401c.equals(this.f28239a) && e5.x.f15050a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(e5.x.m(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i10 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = sb2.toString().getBytes(kp.e.f23433c);
            } catch (JSONException e10) {
                e5.m.d("ClearKeyUtil", "Failed to adjust response data: ".concat(e5.x.m(bArr2)), e10);
            }
        }
        return this.f28240b.provideKeyResponse(bArr, bArr2);
    }

    @Override // n5.w
    public final void u(byte[] bArr) {
        this.f28240b.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x019f, code lost:
    
        if (r5 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0199, code lost:
    
        if ("AFTT".equals(r5) == false) goto L80;
     */
    @Override // n5.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n5.u v(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.a0.v(byte[], java.util.List, int, java.util.HashMap):n5.u");
    }

    @Override // n5.w
    public final int x() {
        return 2;
    }
}
