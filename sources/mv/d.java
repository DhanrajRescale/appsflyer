package mv;

import el.l;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final CopyOnWriteArrayList f28087c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f28088d = new ConcurrentHashMap(512, 0.75f, 2);

    /* renamed from: a, reason: collision with root package name */
    public List f28089a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentSkipListMap f28090b = new ConcurrentSkipListMap();

    static {
        if (!j.f28104a.getAndSet(true)) {
            AtomicReference atomicReference = j.f28105b;
            Object obj = new Object();
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
            ((j) atomicReference.get()).a();
            return;
        }
        throw new IllegalStateException("Already initialized");
    }

    public d(InputStream inputStream) {
        new CopyOnWriteArraySet();
        try {
            b(inputStream);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to load TZDB time-zone rules", e10);
        }
    }

    public static h a(String str) {
        h hVar;
        l.D0(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f28088d;
        d dVar = (d) concurrentHashMap.get(str);
        if (dVar == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new RuntimeException("No time-zone data files registered");
            }
            throw new RuntimeException("Unknown time-zone ID: ".concat(str));
        }
        c cVar = (c) dVar.f28090b.lastEntry().getValue();
        int binarySearch = Arrays.binarySearch(cVar.f28084b, str);
        if (binarySearch < 0) {
            hVar = null;
        } else {
            try {
                short s7 = cVar.f28085c[binarySearch];
                AtomicReferenceArray atomicReferenceArray = cVar.f28086d;
                Object obj = atomicReferenceArray.get(s7);
                if (obj instanceof byte[]) {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                    obj = a.b(dataInputStream.readByte(), dataInputStream);
                    atomicReferenceArray.set(s7, obj);
                }
                hVar = (h) obj;
            } catch (Exception e10) {
                StringBuilder s10 = da.e.s("Invalid binary time-zone data: TZDB:", str, ", version: ");
                s10.append(cVar.f28083a);
                throw new RuntimeException(s10.toString(), e10);
            }
        }
        if (hVar != null) {
            return hVar;
        }
        throw new RuntimeException("Unknown time-zone ID: ".concat(str));
    }

    public static void c(d dVar) {
        l.D0(dVar, "provider");
        Iterator it = new HashSet(dVar.f28089a).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            l.D0(str, "zoneId");
            if (((d) f28088d.putIfAbsent(str, dVar)) != null) {
                throw new RuntimeException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + dVar);
            }
        }
        f28087c.add(dVar);
    }

    public final void b(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() == 1) {
            if ("TZDB".equals(dataInputStream.readUTF())) {
                int readShort = dataInputStream.readShort();
                String[] strArr = new String[readShort];
                for (int i10 = 0; i10 < readShort; i10++) {
                    strArr[i10] = dataInputStream.readUTF();
                }
                int readShort2 = dataInputStream.readShort();
                String[] strArr2 = new String[readShort2];
                for (int i11 = 0; i11 < readShort2; i11++) {
                    strArr2[i11] = dataInputStream.readUTF();
                }
                this.f28089a = Arrays.asList(strArr2);
                int readShort3 = dataInputStream.readShort();
                Object[] objArr = new Object[readShort3];
                for (int i12 = 0; i12 < readShort3; i12++) {
                    byte[] bArr = new byte[dataInputStream.readShort()];
                    dataInputStream.readFully(bArr);
                    objArr[i12] = bArr;
                }
                AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
                HashSet hashSet = new HashSet(readShort);
                for (int i13 = 0; i13 < readShort; i13++) {
                    int readShort4 = dataInputStream.readShort();
                    String[] strArr3 = new String[readShort4];
                    short[] sArr = new short[readShort4];
                    for (int i14 = 0; i14 < readShort4; i14++) {
                        strArr3[i14] = strArr2[dataInputStream.readShort()];
                        sArr[i14] = dataInputStream.readShort();
                    }
                    hashSet.add(new c(strArr[i13], strArr3, sArr, atomicReferenceArray));
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    c cVar2 = (c) this.f28090b.putIfAbsent(cVar.f28083a, cVar);
                    if (cVar2 != null) {
                        String str = cVar2.f28083a;
                        String str2 = cVar.f28083a;
                        if (!str.equals(str2)) {
                            throw new RuntimeException(a3.a.f("Data already loaded for TZDB time-zone rules version: ", str2));
                        }
                    }
                }
                return;
            }
            throw new StreamCorruptedException("File format not recognised");
        }
        throw new StreamCorruptedException("File format not recognised");
    }

    public final String toString() {
        return "TZDB";
    }
}
