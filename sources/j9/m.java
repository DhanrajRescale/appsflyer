package j9;

import com.assetgro.stockgro.data.ContactsWorker;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.facebook.FacebookSdk;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21194b;

    public /* synthetic */ m(Object obj, int i10) {
        this.f21193a = i10;
        this.f21194b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List createWork$lambda$0;
        List uploadContacts$lambda$0;
        Void m18sdkInitialize$lambda9;
        jr.e eVar;
        FileInputStream fileInputStream;
        Throwable th2;
        switch (this.f21193a) {
            case 0:
                return new c0((i) this.f21194b);
            case 1:
                createWork$lambda$0 = ContactsWorker.createWork$lambda$0((ContactsWorker) this.f21194b);
                return createWork$lambda$0;
            case 2:
                uploadContacts$lambda$0 = ContactsRepository.uploadContacts$lambda$0((List) this.f21194b);
                return uploadContacts$lambda$0;
            case 3:
                a3.a.u(this.f21194b);
                m18sdkInitialize$lambda9 = FacebookSdk.m18sdkInitialize$lambda9(null);
                return m18sdkInitialize$lambda9;
            case 4:
                return ((ir.f) this.f21194b).a("firebase");
            default:
                jr.o oVar = (jr.o) this.f21194b;
                synchronized (oVar) {
                    eVar = null;
                    try {
                        fileInputStream = oVar.f21649a.openFileInput(oVar.f21650b);
                    } catch (FileNotFoundException | JSONException unused) {
                        fileInputStream = null;
                    } catch (Throwable th3) {
                        fileInputStream = null;
                        th2 = th3;
                    }
                    try {
                        int available = fileInputStream.available();
                        byte[] bArr = new byte[available];
                        fileInputStream.read(bArr, 0, available);
                        eVar = jr.e.a(new JSONObject(new String(bArr, "UTF-8")));
                        fileInputStream.close();
                    } catch (FileNotFoundException | JSONException unused2) {
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return eVar;
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th2;
                    }
                }
                return eVar;
        }
    }
}
