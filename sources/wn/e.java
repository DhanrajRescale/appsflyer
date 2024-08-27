package wn;

import android.app.Application;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzab;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzadd;
import com.google.android.gms.internal.p002firebaseauthapi.zzbf;
import com.google.android.gms.internal.p002firebaseauthapi.zzbj;
import com.google.android.gms.internal.p002firebaseauthapi.zzca;
import com.google.android.gms.internal.p002firebaseauthapi.zzim;
import com.google.android.gms.internal.p002firebaseauthapi.zzir;
import com.google.android.gms.internal.p002firebaseauthapi.zzj;
import com.google.android.gms.internal.p002firebaseauthapi.zzjp;
import com.google.android.gms.internal.p002firebaseauthapi.zzjr;
import com.google.android.gms.internal.p002firebaseauthapi.zzq;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.chip.ChipGroup;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import dv.t;
import dv.v;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import ls.i0;
import ls.n0;
import ls.u0;
import m.a4;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Http2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import os.k0;

/* loaded from: classes2.dex */
public final class e implements fo.g, ep.c, tp.a, Continuation, i0, os.n, ht.c, nv.o {

    /* renamed from: d, reason: collision with root package name */
    public static e f39325d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39326a;

    /* renamed from: b, reason: collision with root package name */
    public Object f39327b;

    /* renamed from: c, reason: collision with root package name */
    public Object f39328c;

    /* JADX WARN: Type inference failed for: r2v11, types: [dv.v, java.lang.Object] */
    public e(int i10) {
        this.f39326a = i10;
        if (i10 != 4) {
            switch (i10) {
                case 18:
                    this.f39328c = new Paint(2);
                    this.f39327b = null;
                    return;
                case 19:
                    this.f39327b = new AtomicReference();
                    this.f39328c = new AtomicReference();
                    AtomicReference atomicReference = new AtomicReference();
                    ((AtomicReference) this.f39328c).lazySet(atomicReference);
                    return;
                case 20:
                    this.f39327b = new Stack();
                    this.f39328c = new Stack();
                    return;
                case 21:
                    this.f39327b = new HashMap();
                    ?? obj = new Object();
                    obj.f14605b = new LinkedHashMap();
                    obj.f14606c = new ArrayList();
                    obj.f14604a = true;
                    this.f39328c = obj;
                    return;
                default:
                    this.f39327b = new Rect();
                    this.f39328c = new Rect();
                    return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static wn.e k(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2c java.io.IOException -> L2e
            wn.e r2 = new wn.e     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 9
            r2.<init>(r5, r0, r3)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L38
        L25:
            r2 = move-exception
            goto L38
        L27:
            r2 = move-exception
            goto L38
        L29:
            r2 = move-exception
        L2a:
            r0 = r1
            goto L38
        L2c:
            r2 = move-exception
            goto L2a
        L2e:
            r2 = move-exception
            goto L2a
        L30:
            r2 = move-exception
        L31:
            r5 = r1
            r0 = r5
            goto L38
        L34:
            r2 = move-exception
            goto L31
        L36:
            r2 = move-exception
            goto L31
        L38:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L44
            r0.release()     // Catch: java.io.IOException -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L49
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wn.e.k(android.content.Context):wn.e");
    }

    public static e s(Context context, String str) {
        e eVar = f39325d;
        if (eVar == null || !zzq.zza((String) eVar.f39327b, str)) {
            f39325d = new e(context, str);
        }
        return f39325d;
    }

    @Override // os.n
    public final void a(JSONArray jSONArray) {
    }

    @Override // os.n
    public final void b(JSONArray jSONArray) {
    }

    @Override // os.n
    public final void c() {
    }

    @Override // ht.c
    public final void clear() {
        switch (this.f39326a) {
            case 19:
                break;
            default:
                ((Map) this.f39327b).clear();
                return;
        }
        while (i() != null && !isEmpty()) {
        }
    }

    @Override // nv.o
    public final Object e(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        JsonReader newJsonReader = ((Gson) this.f39327b).newJsonReader(responseBody.charStream());
        try {
            Object read = ((TypeAdapter) this.f39328c).read(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }

    @Override // fo.g
    public final void f(ChipGroup chipGroup, ArrayList arrayList) {
        if (!((ChipGroup) this.f39328c).f11258h.f24115a) {
            return;
        }
        a3.a.u(this.f39327b);
        ((ChipGroup) this.f39328c).getCheckedChipId();
        throw null;
    }

    @Override // os.n
    public final void g() {
    }

    @Override // ls.i0
    public final void h(n0 n0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("$ae_crashed_reason", ((Throwable) this.f39327b).toString());
            n0Var.n(jSONObject, "$ae_crashed", true);
        } catch (JSONException unused) {
        }
    }

    @Override // ht.c
    public final Object i() {
        ot.a aVar;
        ot.a aVar2 = (ot.a) ((AtomicReference) this.f39328c).get();
        ot.a aVar3 = (ot.a) aVar2.get();
        if (aVar3 != null) {
            Object obj = aVar3.f30414a;
            aVar3.f30414a = null;
            ((AtomicReference) this.f39328c).lazySet(aVar3);
            return obj;
        }
        if (aVar2 == ((ot.a) ((AtomicReference) this.f39327b).get())) {
            return null;
        }
        do {
            aVar = (ot.a) aVar2.get();
        } while (aVar == null);
        Object obj2 = aVar.f30414a;
        aVar.f30414a = null;
        ((AtomicReference) this.f39328c).lazySet(aVar);
        return obj2;
    }

    @Override // ht.c
    public final boolean isEmpty() {
        switch (this.f39326a) {
            case 19:
                if (((ot.a) ((AtomicReference) this.f39328c).get()) == ((ot.a) ((AtomicReference) this.f39327b).get())) {
                    return true;
                }
                return false;
            default:
                return ((Stack) this.f39327b).isEmpty();
        }
    }

    @Override // os.n
    public final void j(JSONArray jSONArray) {
    }

    public final void l(int[] iArr, int i10) {
        nr.b bVar;
        nr.b bVar2;
        nr.b bVar3;
        if (i10 != 0) {
            int length = iArr.length - i10;
            if (length > 0) {
                int i11 = 0;
                int i12 = 1;
                if (i10 >= ((List) this.f39328c).size()) {
                    nr.b bVar4 = (nr.b) nn.d.g((List) this.f39328c, 1);
                    int size = ((List) this.f39328c).size();
                    while (size <= i10) {
                        nr.a aVar = (nr.a) this.f39327b;
                        int[] iArr2 = {i12, aVar.f29107a[(size - 1) + aVar.f29112f]};
                        if (iArr2[i11] == 0) {
                            int i13 = i12;
                            while (i13 < 2 && iArr2[i13] == 0) {
                                i13++;
                            }
                            if (i13 == 2) {
                                iArr2 = new int[]{i11};
                            } else {
                                int i14 = 2 - i13;
                                int[] iArr3 = new int[i14];
                                System.arraycopy(iArr2, i13, iArr3, i11, i14);
                                iArr2 = iArr3;
                            }
                        }
                        bVar4.getClass();
                        nr.a aVar2 = bVar4.f29113a;
                        if (aVar2.equals(aVar)) {
                            int[] iArr4 = bVar4.f29114b;
                            if (iArr4[i11] == 0 || iArr2[i11] == 0) {
                                bVar4 = aVar2.f29109c;
                            } else {
                                int length2 = iArr4.length;
                                int length3 = iArr2.length;
                                int[] iArr5 = new int[(length2 + length3) - i12];
                                int i15 = i11;
                                while (i15 < length2) {
                                    int i16 = iArr4[i15];
                                    for (int i17 = i11; i17 < length3; i17++) {
                                        int i18 = i15 + i17;
                                        iArr5[i18] = iArr5[i18] ^ aVar2.a(i16, iArr2[i17]);
                                    }
                                    i15++;
                                    i11 = 0;
                                }
                                bVar4 = new nr.b(aVar2, iArr5);
                            }
                            ((List) this.f39328c).add(bVar4);
                            size++;
                            i11 = 0;
                            i12 = 1;
                        } else {
                            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                        }
                    }
                }
                nr.b bVar5 = (nr.b) ((List) this.f39328c).get(i10);
                int[] iArr6 = new int[length];
                System.arraycopy(iArr, 0, iArr6, 0, length);
                nr.a aVar3 = (nr.a) this.f39327b;
                if (length != 0) {
                    if (length > 1 && iArr6[0] == 0) {
                        int i19 = 1;
                        while (i19 < length && iArr6[i19] == 0) {
                            i19++;
                        }
                        if (i19 == length) {
                            iArr6 = new int[]{0};
                        } else {
                            int i20 = length - i19;
                            int[] iArr7 = new int[i20];
                            System.arraycopy(iArr6, i19, iArr7, 0, i20);
                            iArr6 = iArr7;
                        }
                    }
                    if (i10 >= 0) {
                        int length4 = iArr6.length;
                        int[] iArr8 = new int[length4 + i10];
                        for (int i21 = 0; i21 < length4; i21++) {
                            iArr8[i21] = aVar3.a(iArr6[i21], 1);
                        }
                        nr.b bVar6 = new nr.b(aVar3, iArr8);
                        if (aVar3.equals(bVar5.f29113a)) {
                            int[] iArr9 = bVar5.f29114b;
                            if (iArr9[0] != 0) {
                                int i22 = iArr9[(iArr9.length - 1) - bVar5.b()];
                                if (i22 != 0) {
                                    int i23 = aVar3.f29107a[(aVar3.f29110d - aVar3.f29108b[i22]) - 1];
                                    nr.b bVar7 = aVar3.f29109c;
                                    nr.b bVar8 = bVar7;
                                    while (bVar6.b() >= bVar5.b()) {
                                        int[] iArr10 = bVar6.f29114b;
                                        if (iArr10[0] == 0) {
                                            break;
                                        }
                                        int b10 = bVar6.b() - bVar5.b();
                                        int a10 = aVar3.a(iArr10[(iArr10.length - 1) - bVar6.b()], i23);
                                        if (b10 >= 0) {
                                            nr.a aVar4 = bVar5.f29113a;
                                            if (a10 == 0) {
                                                bVar2 = aVar4.f29109c;
                                                bVar = bVar5;
                                            } else {
                                                int length5 = iArr9.length;
                                                int[] iArr11 = new int[length5 + b10];
                                                int i24 = 0;
                                                while (i24 < length5) {
                                                    iArr11[i24] = aVar4.a(iArr9[i24], a10);
                                                    i24++;
                                                    bVar5 = bVar5;
                                                }
                                                bVar = bVar5;
                                                bVar2 = new nr.b(aVar4, iArr11);
                                            }
                                            if (b10 >= 0) {
                                                if (a10 == 0) {
                                                    bVar3 = bVar7;
                                                } else {
                                                    int[] iArr12 = new int[b10 + 1];
                                                    iArr12[0] = a10;
                                                    bVar3 = new nr.b(aVar3, iArr12);
                                                }
                                                bVar8 = bVar8.a(bVar3);
                                                bVar6 = bVar6.a(bVar2);
                                                bVar5 = bVar;
                                            } else {
                                                throw new IllegalArgumentException();
                                            }
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    }
                                    int[] iArr13 = new nr.b[]{bVar8, bVar6}[1].f29114b;
                                    int length6 = i10 - iArr13.length;
                                    for (int i25 = 0; i25 < length6; i25++) {
                                        iArr[length + i25] = 0;
                                    }
                                    System.arraycopy(iArr13, 0, iArr, length + length6, iArr13.length);
                                    return;
                                }
                                throw new ArithmeticException();
                            }
                            throw new IllegalArgumentException("Divide by 0");
                        }
                        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }

    public final File m() {
        if (((File) this.f39327b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f39327b) == null) {
                        pp.g gVar = (pp.g) this.f39328c;
                        gVar.a();
                        this.f39327b = new File(gVar.f31271a.getFilesDir(), "PersistedInstallation." + ((pp.g) this.f39328c).f() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f39327b;
    }

    public final v n(String str) {
        if (str != null) {
            return (v) ((Map) this.f39327b).get(str.toLowerCase());
        }
        return null;
    }

    public final void o(oq.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f30247a);
            jSONObject.put("Status", aVar.f30248b.ordinal());
            jSONObject.put("AuthToken", aVar.f30249c);
            jSONObject.put("RefreshToken", aVar.f30250d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f30252f);
            jSONObject.put("ExpiresInSecs", aVar.f30251e);
            jSONObject.put("FisError", aVar.f30253g);
            pp.g gVar = (pp.g) this.f39328c;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f31271a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(m())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ot.a, java.util.concurrent.atomic.AtomicReference] */
    @Override // ht.c
    public final boolean offer(Object obj) {
        if (obj != null) {
            ?? atomicReference = new AtomicReference();
            atomicReference.f30414a = obj;
            ((ot.a) ((AtomicReference) this.f39327b).getAndSet(atomicReference)).lazySet(atomicReference);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final t p() {
        ((Stack) this.f39328c).pop();
        return (t) ((Stack) this.f39327b).pop();
    }

    public final oq.a q() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        try {
            FileInputStream fileInputStream = new FileInputStream(m());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i10 = oq.a.f30246h;
        a4 a4Var = new a4(7);
        a4Var.f25486g = 0L;
        a4Var.j(oq.c.f30257a);
        a4Var.f25485f = 0L;
        a4Var.f25481b = optString;
        a4Var.j(oq.c.values()[optInt]);
        a4Var.f25483d = optString2;
        a4Var.f25484e = optString3;
        a4Var.f25486g = Long.valueOf(optLong);
        a4Var.f25485f = Long.valueOf(optLong2);
        a4Var.f25487h = optString4;
        return a4Var.i();
    }

    public final void r() {
        try {
            ((FileLock) this.f39328c).release();
            ((FileChannel) this.f39327b).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public final String t(String str) {
        String str2;
        zzjr zzjrVar = (zzjr) this.f39328c;
        if (zzjrVar != null) {
            try {
                synchronized (zzjrVar) {
                    str2 = new String(((zzbj) ((zzjr) this.f39328c).zza().zze(zzbj.class)).zza(Base64.decode(str, 8), null), "UTF-8");
                }
                return str2;
            } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
                Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n".concat(String.valueOf(e10.getMessage())));
                return null;
            }
        }
        Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        String str;
        if (!task.isSuccessful()) {
            return Tasks.forException(new Exception((String) Preconditions.checkNotNull(((Exception) Preconditions.checkNotNull(task.getException())).getMessage())));
        }
        zzadd zzaddVar = (zzadd) task.getResult();
        String zzb = zzaddVar.zzb();
        if (zzac.zzd(zzb)) {
            return Tasks.forException(new Exception("No Recaptcha Enterprise siteKey configured for tenant/project ".concat(String.valueOf((String) this.f39327b))));
        }
        List zzd = zzab.zzb(zzj.zzb('/')).zzd(zzb);
        if (zzd.size() != 4) {
            str = null;
        } else {
            str = (String) zzd.get(3);
        }
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception("Invalid siteKey format ".concat(String.valueOf(zzb))));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant ".concat(String.valueOf((String) this.f39327b)));
        }
        Object obj = this.f39328c;
        ((q.h) obj).f31451c = zzaddVar;
        pp.g gVar = (pp.g) ((q.h) obj).f31452d;
        gVar.a();
        Task<RecaptchaTasksClient> tasksClient = Recaptcha.getTasksClient((Application) gVar.f31271a, str);
        ((Map) ((q.h) this.f39328c).f31450b).put((String) this.f39327b, tasksClient);
        return tasksClient;
    }

    public final String u() {
        if (((zzjr) this.f39328c) == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzca zza = zzbf.zza(byteArrayOutputStream);
        try {
            synchronized (((zzjr) this.f39328c)) {
                ((zzjr) this.f39328c).zza().zzb().zzg(zza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n".concat(String.valueOf(e10.getMessage())));
            return null;
        }
    }

    @Override // ep.c
    public final Object zza() {
        Context context = ((dp.f) ((ep.c) this.f39327b)).f14447a.f15616b;
        if (context != null) {
            return new dp.k(context, (dp.l) ((ep.c) this.f39328c).zza());
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f39326a = i10;
        this.f39328c = obj;
        this.f39327b = obj2;
    }

    public /* synthetic */ e(Object obj, Object obj2, int i10) {
        this.f39326a = i10;
        this.f39327b = obj;
        this.f39328c = obj2;
    }

    public e(Context context, String str) {
        zzjr zzjrVar;
        this.f39326a = 8;
        this.f39327b = str;
        try {
            zzim.zza();
            zzjp zzjpVar = new zzjp();
            zzjpVar.zzf(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str));
            zzjpVar.zzd(zzir.zza);
            zzjpVar.zze(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzjrVar = zzjpVar.zzg();
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n".concat(String.valueOf(e10.getMessage())));
            zzjrVar = null;
        }
        this.f39328c = zzjrVar;
    }

    public e(nr.a aVar) {
        this.f39326a = 12;
        this.f39327b = aVar;
        ArrayList arrayList = new ArrayList();
        this.f39328c = arrayList;
        arrayList.add(new nr.b(aVar, new int[]{1}));
    }

    public e(mq.c cVar) {
        this.f39326a = 11;
        this.f39328c = Collections.synchronizedMap(new HashMap());
        this.f39327b = cVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(k0 k0Var, ArrayList arrayList) {
        this(k0Var, arrayList, 16);
        this.f39326a = 16;
    }

    public e(pp.g gVar) {
        this.f39326a = 10;
        this.f39328c = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(u0 u0Var) {
        this(u0Var, (Object) null, 15);
        this.f39326a = 15;
    }

    public e(p003do.b bVar, p003do.b bVar2) {
        this.f39326a = 1;
        bVar.getClass();
        bVar2.getClass();
        if (s0.g.f34069a > s0.g.f34069a) {
            throw new IllegalArgumentException();
        }
        this.f39327b = bVar;
        this.f39328c = bVar2;
    }
}
