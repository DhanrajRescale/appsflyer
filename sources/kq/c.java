package kq;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f23460b;

    public /* synthetic */ c(d dVar, int i10) {
        this.f23459a = i10;
        this.f23460b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f23459a) {
            case 0:
                d dVar = this.f23460b;
                synchronized (dVar) {
                    try {
                        h hVar = (h) dVar.f23461a.get();
                        ArrayList c10 = hVar.c();
                        hVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i10 = 0; i10 < c10.size(); i10++) {
                            a aVar = (a) c10.get(i10);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f23455a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f23456b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                            } finally {
                            }
                        } catch (Throwable th2) {
                            try {
                                base64OutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return byteArrayOutputStream;
            default:
                d dVar2 = this.f23460b;
                synchronized (dVar2) {
                    ((h) dVar2.f23461a.get()).h(System.currentTimeMillis(), ((hr.b) dVar2.f23463c.get()).a());
                }
                return null;
        }
    }
}
