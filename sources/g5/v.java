package g5;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class v extends b {

    /* renamed from: e, reason: collision with root package name */
    public final int f16628e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f16629f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f16630g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f16631h;

    /* renamed from: i, reason: collision with root package name */
    public DatagramSocket f16632i;

    /* renamed from: j, reason: collision with root package name */
    public MulticastSocket f16633j;

    /* renamed from: k, reason: collision with root package name */
    public InetAddress f16634k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16635l;

    /* renamed from: m, reason: collision with root package name */
    public int f16636m;

    public v() {
        super(true);
        this.f16628e = 8000;
        byte[] bArr = new byte[CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE];
        this.f16629f = bArr;
        this.f16630g = new DatagramPacket(bArr, 0, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
    }

    @Override // g5.f
    public final void close() {
        this.f16631h = null;
        MulticastSocket multicastSocket = this.f16633j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f16634k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f16633j = null;
        }
        DatagramSocket datagramSocket = this.f16632i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f16632i = null;
        }
        this.f16634k = null;
        this.f16636m = 0;
        if (this.f16635l) {
            this.f16635l = false;
            q();
        }
    }

    @Override // g5.f
    public final Uri l() {
        return this.f16631h;
    }

    @Override // g5.f
    public final long o(i iVar) {
        Uri uri = iVar.f16569a;
        this.f16631h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f16631h.getPort();
        r();
        try {
            this.f16634k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f16634k, port);
            if (this.f16634k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f16633j = multicastSocket;
                multicastSocket.joinGroup(this.f16634k);
                this.f16632i = this.f16633j;
            } else {
                this.f16632i = new DatagramSocket(inetSocketAddress);
            }
            this.f16632i.setSoTimeout(this.f16628e);
            this.f16635l = true;
            s(iVar);
            return -1L;
        } catch (IOException e10) {
            throw new DataSourceException(2001, e10);
        } catch (SecurityException e11) {
            throw new DataSourceException(2006, e11);
        }
    }

    @Override // b5.o
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f16636m;
        DatagramPacket datagramPacket = this.f16630g;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f16632i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f16636m = length;
                p(length);
            } catch (SocketTimeoutException e10) {
                throw new DataSourceException(2002, e10);
            } catch (IOException e11) {
                throw new DataSourceException(2001, e11);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f16636m;
        int min = Math.min(i13, i11);
        System.arraycopy(this.f16629f, length2 - i13, bArr, i10, min);
        this.f16636m -= min;
        return min;
    }
}
