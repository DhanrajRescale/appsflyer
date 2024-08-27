package com.cardreader.card_reader_lib;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcA;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import da.e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import uk.a;
import uk.b;
import vk.c;
import vk.d;
import zq.f;

/* loaded from: classes.dex */
public class CardTask {

    /* renamed from: c, reason: collision with root package name */
    public static b f10838c;

    /* renamed from: d, reason: collision with root package name */
    public static final IntentFilter[] f10839d = {new IntentFilter("android.nfc.action.TECH_DISCOVERED"), new IntentFilter("android.nfc.action.TAG_DISCOVERED")};

    /* renamed from: e, reason: collision with root package name */
    public static final String[][] f10840e = {new String[]{NfcA.class.getName(), IsoDep.class.getName()}};

    /* renamed from: a, reason: collision with root package name */
    public NfcAdapter f10841a;

    /* renamed from: b, reason: collision with root package name */
    public PendingIntent f10842b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, uk.b] */
    @Keep
    public CardTask() {
        f10838c = new Object();
    }

    public static boolean a(byte[] bArr) {
        byte[] K = f.K(bArr, vk.b.f38148d, vk.b.f38154j);
        Log.d("Track2", f.A(K));
        if (K != null) {
            Log.d("track2 succeded -", "We got track2 data Sam");
            try {
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                for (byte b10 : K) {
                    str = str + String.format("%02X", Byte.valueOf(b10));
                }
                String[] split = str.split("D");
                b bVar = f10838c;
                bVar.f37235a = split[0];
                bVar.f37236b = split[1].substring(2, 4);
                f10838c.f37237c = split[1].substring(0, 2);
                return true;
            } catch (Exception e10) {
                Log.e("parseTrack2 exception", e10.toString());
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, uk.a] */
    @Keep
    public List<a> extractAfl(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        while (byteArrayInputStream.available() >= 4) {
            ?? obj = new Object();
            obj.f37232a = byteArrayInputStream.read() >> 3;
            obj.f37233b = byteArrayInputStream.read();
            obj.f37234c = byteArrayInputStream.read();
            byteArrayInputStream.read();
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, vk.e] */
    @Keep
    public boolean extractPublicData(IsoDep isoDep, byte[] bArr) throws IOException {
        int length;
        int i10;
        int i11;
        int length2;
        int i12;
        int i13;
        boolean a10;
        int i14;
        int i15;
        int i16;
        char c10 = 0;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        int i17 = 5;
        int i18 = 4;
        if (bArr != null && bArr.length != 0) {
            i10 = bArr.length + 5;
        } else {
            i10 = 4;
        }
        byte[] bArr2 = new byte[i10 + 1];
        byte b10 = (byte) 0;
        bArr2[0] = b10;
        bArr2[1] = (byte) 164;
        bArr2[2] = (byte) 4;
        int i19 = 3;
        bArr2[3] = b10;
        if (bArr != null && bArr.length != 0) {
            bArr2[4] = (byte) length;
            System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
            i11 = bArr.length + 5;
        } else {
            i11 = 4;
        }
        bArr2[i11] = (byte) (bArr2[i11] + b10);
        Log.d("APDU", f.A(bArr2));
        byte[] transceive = isoDep.transceive(bArr2);
        Log.d("resData", f.A(transceive));
        if (f.Q(transceive, f.H("9000"))) {
            Log.d("got resData -", f.A(transceive));
            byte[] K = f.K(transceive, vk.b.f38147c);
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            for (byte b11 : K) {
                StringBuilder p10 = e.p(str);
                p10.append(String.format("%02X", Byte.valueOf(b11)));
                str = p10.toString();
            }
            Log.d("AidString", str);
            f10838c.getClass();
            byte[] K2 = f.K(transceive, vk.b.f38152h);
            if (K2 != null) {
                Log.d("PDOL", f.A(K2));
            }
            ArrayList arrayList = new ArrayList();
            if (K2 != null) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(K2);
                while (byteArrayInputStream.available() > 0) {
                    if (byteArrayInputStream.available() >= 2) {
                        vk.f f02 = f.f0(f.c0(byteArrayInputStream));
                        int d02 = f.d0(byteArrayInputStream);
                        ?? obj = new Object();
                        obj.f38158a = f02;
                        obj.f38159b = d02;
                        arrayList.add(obj);
                    } else {
                        throw new RuntimeException("Data length < 2 : " + byteArrayInputStream.available());
                    }
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(vk.b.f38150f.f38160a);
                Iterator it = arrayList.iterator();
                int i20 = 0;
                while (it.hasNext()) {
                    i20 += ((vk.e) it.next()).f38159b;
                }
                byteArrayOutputStream.write(i20);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    vk.e eVar = (vk.e) it2.next();
                    Log.d("PDOLList", eVar.toString());
                    byteArrayOutputStream.write(c.a(eVar));
                }
            } catch (IOException e10) {
                Log.e("getGPO exception", e10.toString());
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray == null) {
                length2 = 0;
            } else {
                length2 = byteArray.length;
            }
            if (byteArray != null && byteArray.length != 0) {
                i12 = byteArray.length + 5;
            } else {
                i12 = 4;
            }
            byte[] bArr3 = new byte[i12 + 1];
            bArr3[0] = (byte) 128;
            bArr3[1] = (byte) 168;
            bArr3[2] = b10;
            bArr3[3] = b10;
            if (byteArray != null && byteArray.length != 0) {
                bArr3[4] = (byte) length2;
                System.arraycopy(byteArray, 0, bArr3, 5, byteArray.length);
                i13 = byteArray.length + 5;
            } else {
                i13 = 4;
            }
            bArr3[i13] = (byte) (bArr3[i13] + b10);
            byte[] transceive2 = isoDep.transceive(bArr3);
            if (transceive2 != null) {
                Log.d("GPO", f.A(transceive2));
            }
            if (f.Q(transceive2, f.H("9000"))) {
                Log.d("gpo succeded -", f.A(transceive2));
                byte[] K3 = f.K(transceive2, vk.b.f38149e);
                if (K3 != null) {
                    Log.d("msgData", f.A(K3));
                    int length3 = K3.length;
                    if (length3 > K3.length) {
                        length3 = K3.length;
                    }
                    int i21 = length3 - 2;
                    if (i21 <= 0) {
                        K3 = new byte[0];
                    } else {
                        byte[] bArr4 = new byte[i21];
                        System.arraycopy(K3, 2, bArr4, 0, i21);
                        K3 = bArr4;
                    }
                    a10 = false;
                } else {
                    a10 = a(transceive2);
                    if (!a10) {
                        K3 = f.K(transceive2, vk.b.f38151g);
                    }
                }
                if (K3 != null) {
                    loop4: for (a aVar : extractAfl(K3)) {
                        int i22 = aVar.f37233b;
                        while (i22 <= aVar.f37234c) {
                            int i23 = (aVar.f37232a << i19) | i18;
                            byte[] bArr5 = new byte[i17];
                            bArr5[c10] = b10;
                            byte b12 = (byte) 178;
                            bArr5[1] = b12;
                            byte b13 = (byte) i22;
                            bArr5[2] = b13;
                            bArr5[i19] = (byte) i23;
                            bArr5[i18] = (byte) (bArr5[i18] + b10);
                            byte[] transceive3 = isoDep.transceive(bArr5);
                            if (f.Q(transceive3, f.H("6C"))) {
                                i15 = 3;
                                i14 = 4;
                                byte[] bArr6 = {b10, b12, b13, (byte) ((aVar.f37232a << i19) | i18), (byte) (bArr6[4] + transceive3[transceive3.length - 1])};
                                transceive3 = isoDep.transceive(bArr6);
                                i16 = 5;
                            } else {
                                i14 = i18;
                                i15 = i19;
                                i16 = 5;
                            }
                            if (f.Q(transceive3, f.H("9000")) && (a10 = a(transceive3))) {
                                break loop4;
                            }
                            i22++;
                            i19 = i15;
                            i17 = i16;
                            i18 = i14;
                            c10 = 0;
                        }
                        c10 = 0;
                    }
                }
                return a10;
            }
        }
        return false;
    }

    @Keep
    public String getCardDetails(Intent intent) {
        NfcAdapter nfcAdapter;
        try {
            if (intent.getAction().equals("android.nfc.action.TECH_DISCOVERED") && (nfcAdapter = this.f10841a) != null && nfcAdapter.isEnabled()) {
                Tag tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
                if (tag != null) {
                    readWithPSE(IsoDep.get(tag));
                }
                b bVar = f10838c;
                String str = bVar.f37235a;
                String str2 = bVar.f37236b;
                String str3 = bVar.f37237c;
                if (str == null || str2 == null || str3 == null) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cardNumber", f10838c.f37235a);
                jSONObject.put("expiryMonth", f10838c.f37236b);
                jSONObject.put("expiryYear", f10838c.f37237c);
                return jSONObject.toString();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return null;
    }

    @Keep
    public boolean isNFCEnabled(Context context) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        this.f10841a = defaultAdapter;
        if (defaultAdapter != null) {
            return defaultAdapter.isEnabled();
        }
        return false;
    }

    @Keep
    public boolean isNFCSupported(Context context) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        this.f10841a = defaultAdapter;
        if (defaultAdapter == null) {
            return false;
        }
        return true;
    }

    @Keep
    public void onPauseClone(Activity activity) {
        NfcAdapter nfcAdapter = this.f10841a;
        if (nfcAdapter != null) {
            nfcAdapter.disableForegroundDispatch(activity);
        }
    }

    @Keep
    public void onResumeClone(Activity activity) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f10842b = PendingIntent.getActivity(activity.getApplicationContext(), 0, new Intent(activity.getApplicationContext(), activity.getClass()).addFlags(536870912), 33554432);
        } else {
            this.f10842b = PendingIntent.getActivity(activity.getApplicationContext(), 0, new Intent(activity.getApplicationContext(), activity.getClass()).addFlags(536870912), 67108864);
        }
        this.f10841a.enableForegroundDispatch(activity, this.f10842b, f10839d, f10840e);
    }

    @Keep
    public boolean readWithPSE(IsoDep isoDep) throws IOException {
        int length;
        int i10;
        byte[] bArr;
        byte[] bytes = "2PAY.SYS.DDF01".getBytes();
        isoDep.connect();
        if (bytes == null) {
            length = 0;
        } else {
            length = bytes.length;
        }
        int i11 = 4;
        if (bytes != null && bytes.length != 0) {
            i10 = bytes.length + 5;
        } else {
            i10 = 4;
        }
        byte[] bArr2 = new byte[i10 + 1];
        byte b10 = (byte) 0;
        bArr2[0] = b10;
        bArr2[1] = (byte) 164;
        bArr2[2] = (byte) 4;
        bArr2[3] = b10;
        if (bytes != null && bytes.length != 0) {
            bArr2[4] = (byte) length;
            System.arraycopy(bytes, 0, bArr2, 5, bytes.length);
            i11 = 5 + bytes.length;
        }
        bArr2[i11] = (byte) (bArr2[i11] + b10);
        byte[] transceive = isoDep.transceive(bArr2);
        Log.d("PSE", f.A(transceive));
        if (f.Q(transceive, f.H("9000"))) {
            ArrayList arrayList = new ArrayList();
            Iterator it = f.L(transceive, vk.b.f38146b, vk.b.f38155k).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                vk.f fVar = dVar.f38156a;
                vk.f fVar2 = vk.b.f38155k;
                byte[] bArr3 = dVar.f38157b;
                if (fVar == fVar2 && arrayList.size() != 0) {
                    byte[] bArr4 = (byte[]) h.l(arrayList, 1);
                    if (bArr4 == null) {
                        if (bArr3 == null) {
                            bArr = null;
                        } else {
                            bArr = (byte[]) bArr3.clone();
                        }
                    } else if (bArr3 == null) {
                        bArr = (byte[]) bArr4.clone();
                    } else {
                        byte[] bArr5 = new byte[bArr4.length + bArr3.length];
                        System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
                        System.arraycopy(bArr3, 0, bArr5, bArr4.length, bArr3.length);
                        bArr = bArr5;
                    }
                    arrayList.add(bArr);
                } else {
                    arrayList.add(bArr3);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr6 = (byte[]) it2.next();
                Log.d("PSE AIDs", f.A(bArr6));
                try {
                    if (extractPublicData(isoDep, bArr6)) {
                        isoDep.close();
                        return true;
                    }
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        isoDep.close();
        return false;
    }
}
