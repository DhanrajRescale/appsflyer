package com.appsflyer.internal;

import com.airbnb.deeplinkdispatch.MetadataMasks;
import com.google.android.gms.common.api.Api;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFj1lSDK extends FilterInputStream {
    private byte[] AFInAppEventParameterName;
    private byte[] AFInAppEventType;
    private final int AFKeystoreWrapper;
    private int AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private int f8515d;

    /* renamed from: e, reason: collision with root package name */
    private int f8516e;
    private int registerClient;
    private int[] unregisterClient;
    private AFj1nSDK valueOf;
    private byte[] values;

    public AFj1lSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i10, boolean z10, int i11) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.f8515d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int min = Math.min(Math.max(i10, 3), 16);
        this.AFKeystoreWrapper = min;
        this.values = new byte[8];
        byte[] bArr2 = new byte[8];
        this.AFInAppEventType = bArr2;
        this.AFInAppEventParameterName = new byte[8];
        this.unregisterClient = new int[2];
        this.AFLogger = 8;
        this.f8516e = 8;
        this.registerClient = i11;
        if (i11 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.valueOf = new AFj1nSDK(iArr, min, true, false);
    }

    private int AFInAppEventParameterName() throws IOException {
        if (this.f8515d == Integer.MAX_VALUE) {
            this.f8515d = ((FilterInputStream) this).in.read();
        }
        int i10 = 8;
        if (this.AFLogger == 8) {
            byte[] bArr = this.values;
            int i11 = this.f8515d;
            bArr[0] = (byte) i11;
            if (i11 >= 0) {
                int i12 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.values, i12, 8 - i12);
                    if (read <= 0) {
                        break;
                    }
                    i12 += read;
                } while (i12 < 8);
                if (i12 >= 8) {
                    values();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.f8515d = read2;
                    this.AFLogger = 0;
                    if (read2 < 0) {
                        i10 = 8 - (this.values[7] & 255);
                    }
                    this.f8516e = i10;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.f8516e;
    }

    private void values() {
        if (this.registerClient == 2) {
            byte[] bArr = this.values;
            System.arraycopy(bArr, 0, this.AFInAppEventParameterName, 0, bArr.length);
        }
        byte[] bArr2 = this.values;
        int i10 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << MetadataMasks.ComponentParamMask) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i11 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << MetadataMasks.ComponentParamMask)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i12 = this.AFKeystoreWrapper;
        AFj1nSDK aFj1nSDK = this.valueOf;
        AFj1oSDK.values(i10, i11, false, i12, aFj1nSDK.values, aFj1nSDK.valueOf, this.unregisterClient);
        int[] iArr = this.unregisterClient;
        int i13 = iArr[0];
        int i14 = iArr[1];
        byte[] bArr3 = this.values;
        bArr3[0] = (byte) (i13 >> 24);
        bArr3[1] = (byte) (i13 >> 16);
        bArr3[2] = (byte) (i13 >> 8);
        bArr3[3] = (byte) i13;
        bArr3[4] = (byte) (i14 >> 24);
        bArr3[5] = (byte) (i14 >> 16);
        bArr3[6] = (byte) (i14 >> 8);
        bArr3[7] = (byte) i14;
        if (this.registerClient == 2) {
            for (int i15 = 0; i15 < 8; i15++) {
                byte[] bArr4 = this.values;
                bArr4[i15] = (byte) (bArr4[i15] ^ this.AFInAppEventType[i15]);
            }
            byte[] bArr5 = this.AFInAppEventParameterName;
            System.arraycopy(bArr5, 0, this.AFInAppEventType, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFInAppEventParameterName();
        return this.f8516e - this.AFLogger;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFInAppEventParameterName();
        int i10 = this.AFLogger;
        if (i10 >= this.f8516e) {
            return -1;
        }
        byte[] bArr = this.values;
        this.AFLogger = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            AFInAppEventParameterName();
            int i14 = this.AFLogger;
            if (i14 >= this.f8516e) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.values;
            this.AFLogger = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
