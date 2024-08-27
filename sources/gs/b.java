package gs;

import android.os.Message;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.WebsocketNotConnectedException;
import el.l;
import h.b0;
import is.d;
import is.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import jr.h;
import js.c;
import js.f;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import org.json.JSONException;
import org.json.JSONObject;
import os.g;
import os.i;
import os.u;

/* loaded from: classes2.dex */
public abstract class b extends vl.b implements Runnable, fs.a {

    /* renamed from: g, reason: collision with root package name */
    public URI f17554g;

    /* renamed from: h, reason: collision with root package name */
    public fs.b f17555h;

    /* renamed from: i, reason: collision with root package name */
    public Socket f17556i;

    /* renamed from: j, reason: collision with root package name */
    public InputStream f17557j;

    /* renamed from: k, reason: collision with root package name */
    public OutputStream f17558k;

    /* renamed from: l, reason: collision with root package name */
    public Proxy f17559l;

    /* renamed from: m, reason: collision with root package name */
    public Thread f17560m;

    /* renamed from: n, reason: collision with root package name */
    public Map f17561n;

    /* renamed from: o, reason: collision with root package name */
    public CountDownLatch f17562o;

    /* renamed from: p, reason: collision with root package name */
    public CountDownLatch f17563p;

    /* renamed from: q, reason: collision with root package name */
    public int f17564q;

    @Override // vl.b
    public final void O(int i10, String str) {
        this.f17562o.countDown();
        this.f17563p.countDown();
        Thread thread = this.f17560m;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            Socket socket = this.f17556i;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e10) {
            u0(e10);
        }
        StringBuilder sb2 = new StringBuilder("WebSocket closed. Code: ");
        sb2.append(i10);
        sb2.append(", reason: ");
        sb2.append(str);
        sb2.append("\nURI: ");
        i iVar = ((g) this).f30319r;
        sb2.append(iVar.f30333c);
        l.T0("MixpanelAPI.EditorCnctn", sb2.toString());
        u uVar = (u) iVar.f30331a.f30362a;
        uVar.f30399h.sendMessage(uVar.f30399h.obtainMessage(8));
    }

    @Override // vl.b
    public final void P() {
    }

    @Override // vl.b
    public final void Q() {
    }

    @Override // vl.b
    public final void R(Exception exc) {
        u0(exc);
    }

    @Override // vl.b
    public final void S() {
    }

    @Override // vl.b
    public final void T(String str) {
        g gVar = (g) this;
        l.T0("MixpanelAPI.EditorCnctn", "Received message from editor:\n" + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            boolean equals = string.equals("device_info_request");
            i iVar = gVar.f30319r;
            if (equals) {
                Object obj = iVar.f30331a.f30362a;
                ((u) obj).f30399h.sendMessage(((u) obj).f30399h.obtainMessage(4));
            } else if (string.equals("snapshot_request")) {
                Object obj2 = iVar.f30331a.f30362a;
                Message obtainMessage = ((u) obj2).f30399h.obtainMessage(2);
                obtainMessage.obj = jSONObject;
                ((u) obj2).f30399h.sendMessage(obtainMessage);
            } else if (string.equals("change_request")) {
                Object obj3 = iVar.f30331a.f30362a;
                Message obtainMessage2 = ((u) obj3).f30399h.obtainMessage(3);
                obtainMessage2.obj = jSONObject;
                ((u) obj3).f30399h.sendMessage(obtainMessage2);
            } else if (string.equals("event_binding_request")) {
                Object obj4 = iVar.f30331a.f30362a;
                Message obtainMessage3 = ((u) obj4).f30399h.obtainMessage(6);
                obtainMessage3.obj = jSONObject;
                ((u) obj4).f30399h.sendMessage(obtainMessage3);
            } else if (string.equals("clear_request")) {
                Object obj5 = iVar.f30331a.f30362a;
                Message obtainMessage4 = ((u) obj5).f30399h.obtainMessage(10);
                obtainMessage4.obj = jSONObject;
                ((u) obj5).f30399h.sendMessage(obtainMessage4);
            } else if (string.equals("tweak_request")) {
                Object obj6 = iVar.f30331a.f30362a;
                Message obtainMessage5 = ((u) obj6).f30399h.obtainMessage(11);
                obtainMessage5.obj = jSONObject;
                ((u) obj6).f30399h.sendMessage(obtainMessage5);
            }
        } catch (JSONException e10) {
            l.N("MixpanelAPI.EditorCnctn", "Bad JSON received:" + str, e10);
        }
    }

    @Override // vl.b
    public final void U() {
    }

    @Override // vl.b
    public final void V(js.b bVar) {
        this.f17562o.countDown();
        l.T0("MixpanelAPI.EditorCnctn", "Websocket connected");
    }

    @Override // vl.b
    public final void X() {
    }

    @Override // fs.a
    public final void a(d dVar) {
        this.f17555h.a(dVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int read;
        fs.b bVar = this.f17555h;
        try {
            Socket socket = this.f17556i;
            if (socket == null) {
                this.f17556i = new Socket(this.f17559l);
            } else if (socket.isClosed()) {
                throw new IOException();
            }
            if (!this.f17556i.isBound()) {
                this.f17556i.connect(new InetSocketAddress(this.f17554g.getHost(), t0()), this.f17564q);
            }
            this.f17557j = this.f17556i.getInputStream();
            this.f17558k = this.f17556i.getOutputStream();
            w0();
            Thread thread = new Thread(new a(this));
            this.f17560m = thread;
            thread.start();
            int i10 = fs.b.f16227m;
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (this.f17555h.f16230c != 5 && (read = this.f17557j.read(bArr)) != -1) {
                try {
                    bVar.d(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException unused) {
                    bVar.f();
                    return;
                } catch (RuntimeException e10) {
                    u0(e10);
                    bVar.c(1006, e10.getMessage(), false);
                    return;
                }
            }
            bVar.f();
        } catch (Exception e11) {
            u0(e11);
            bVar.c(-1, e11.getMessage(), false);
        }
    }

    public final int t0() {
        URI uri = this.f17554g;
        int port = uri.getPort();
        if (port == -1) {
            String scheme = uri.getScheme();
            if (scheme.equals("wss")) {
                return 443;
            }
            if (scheme.equals("ws")) {
                return 80;
            }
            throw new RuntimeException("unkonow scheme".concat(scheme));
        }
        return port;
    }

    public abstract void u0(Exception exc);

    @Override // vl.b
    public final InetSocketAddress v() {
        Socket socket = this.f17556i;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    public final void v0(ByteBuffer byteBuffer, boolean z10) {
        fs.b bVar = this.f17555h;
        hs.a aVar = bVar.f16232e;
        aVar.getClass();
        boolean z11 = true;
        if (aVar.f18696b != 0) {
            aVar.f18696b = 1;
        } else {
            aVar.f18696b = 2;
        }
        e eVar = new e(aVar.f18696b);
        try {
            eVar.f20528c = byteBuffer;
            eVar.f20526a = z10;
            if (z10) {
                aVar.f18696b = 0;
            } else {
                aVar.f18696b = 2;
            }
            List singletonList = Collections.singletonList(eVar);
            if (bVar.f16230c != 3) {
                z11 = false;
            }
            if (z11) {
                Iterator it = singletonList.iterator();
                while (it.hasNext()) {
                    bVar.a((d) it.next());
                }
                return;
            }
            throw new WebsocketNotConnectedException();
        } catch (InvalidDataException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void w0() {
        String str;
        int length;
        URI uri = this.f17554g;
        String path = uri.getPath();
        String query = uri.getQuery();
        if (path == null || path.length() == 0) {
            path = "/";
        }
        if (query != null) {
            path = a3.a.g(path, "?", query);
        }
        int t02 = t0();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri.getHost());
        if (t02 != 80) {
            str = h.n(":", t02);
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        c cVar = new c();
        if (path != null) {
            cVar.f21656c = path;
            cVar.h("Host", sb3);
            Map map = this.f17561n;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    cVar.h((String) entry.getKey(), (String) entry.getValue());
                }
            }
            fs.b bVar = this.f17555h;
            vl.b bVar2 = bVar.f16231d;
            bVar.f16236i = bVar.f16232e.g(cVar);
            try {
                bVar2.getClass();
                hs.a aVar = bVar.f16232e;
                js.e eVar = bVar.f16236i;
                aVar.getClass();
                StringBuilder sb4 = new StringBuilder(100);
                if (eVar instanceof js.a) {
                    sb4.append("GET ");
                    sb4.append(((c) eVar).f21656c);
                    sb4.append(" HTTP/1.1");
                } else if (eVar instanceof f) {
                    sb4.append("HTTP/1.1 101 " + ((js.d) ((f) eVar)).f21657c);
                } else {
                    throw new RuntimeException("unknow role");
                }
                sb4.append("\r\n");
                b0 b0Var = (b0) eVar;
                for (String str2 : Collections.unmodifiableSet(((TreeMap) b0Var.f17580b).keySet())) {
                    String d10 = b0Var.d(str2);
                    sb4.append(str2);
                    sb4.append(": ");
                    sb4.append(d10);
                    sb4.append("\r\n");
                }
                sb4.append("\r\n");
                String sb5 = sb4.toString();
                CodingErrorAction codingErrorAction = ks.b.f23483a;
                try {
                    byte[] bytes = sb5.getBytes("ASCII");
                    byte[] bArr = (byte[]) b0Var.f17579a;
                    if (bArr == null) {
                        length = 0;
                    } else {
                        length = bArr.length;
                    }
                    ByteBuffer allocate = ByteBuffer.allocate(length + bytes.length);
                    allocate.put(bytes);
                    if (bArr != null) {
                        allocate.put(bArr);
                    }
                    allocate.flip();
                    Iterator it = Collections.singletonList(allocate).iterator();
                    while (it.hasNext()) {
                        bVar.f16228a.add((ByteBuffer) it.next());
                        bVar.f16231d.X();
                    }
                    return;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (InvalidDataException unused) {
                throw new InvalidHandshakeException("Handshake data rejected by client.");
            } catch (RuntimeException e11) {
                bVar2.R(e11);
                throw new InvalidHandshakeException("rejected because of" + e11);
            }
        }
        throw new IllegalArgumentException("http resource descriptor must not be null");
    }
}
