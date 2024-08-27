package hq;

import android.util.Base64;
import android.util.JsonWriter;
import fq.f;
import fq.g;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e implements fq.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18678a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f18679b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f18680c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f18681d;

    /* renamed from: e, reason: collision with root package name */
    public final fq.d f18682e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18683f;

    public e(Writer writer, HashMap hashMap, HashMap hashMap2, a aVar, boolean z10) {
        this.f18679b = new JsonWriter(writer);
        this.f18680c = hashMap;
        this.f18681d = hashMap2;
        this.f18682e = aVar;
        this.f18683f = z10;
    }

    @Override // fq.e
    public final fq.e a(fq.c cVar, boolean z10) {
        String str = cVar.f16205a;
        i();
        JsonWriter jsonWriter = this.f18679b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(z10);
        return this;
    }

    @Override // fq.e
    public final fq.e b(fq.c cVar, long j10) {
        String str = cVar.f16205a;
        i();
        JsonWriter jsonWriter = this.f18679b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(j10);
        return this;
    }

    @Override // fq.e
    public final fq.e c(fq.c cVar, int i10) {
        String str = cVar.f16205a;
        i();
        JsonWriter jsonWriter = this.f18679b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(i10);
        return this;
    }

    @Override // fq.e
    public final fq.e d(fq.c cVar, Object obj) {
        h(obj, cVar.f16205a);
        return this;
    }

    @Override // fq.g
    public final g e(String str) {
        i();
        this.f18679b.value(str);
        return this;
    }

    @Override // fq.g
    public final g f(boolean z10) {
        i();
        this.f18679b.value(z10);
        return this;
    }

    public final e g(Object obj) {
        JsonWriter jsonWriter = this.f18679b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                i();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            int i10 = 0;
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i10 < length) {
                    jsonWriter.value(r6[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    long j10 = jArr[i10];
                    i();
                    jsonWriter.value(j10);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    jsonWriter.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    jsonWriter.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i10 < length5) {
                    g(numberArr[i10]);
                    i10++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i10 < length6) {
                    g(objArr[i10]);
                    i10++;
                }
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            jsonWriter.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                g(it.next());
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    h(entry.getValue(), (String) key);
                } catch (ClassCastException e10) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                }
            }
            jsonWriter.endObject();
            return this;
        }
        fq.d dVar = (fq.d) this.f18680c.get(obj.getClass());
        if (dVar != null) {
            jsonWriter.beginObject();
            dVar.encode(obj, this);
            jsonWriter.endObject();
            return this;
        }
        f fVar = (f) this.f18681d.get(obj.getClass());
        if (fVar != null) {
            fVar.encode(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            String name = ((Enum) obj).name();
            i();
            jsonWriter.value(name);
            return this;
        }
        jsonWriter.beginObject();
        this.f18682e.encode(obj, this);
        jsonWriter.endObject();
        return this;
    }

    public final e h(Object obj, String str) {
        boolean z10 = this.f18683f;
        JsonWriter jsonWriter = this.f18679b;
        if (z10) {
            if (obj != null) {
                i();
                jsonWriter.name(str);
                g(obj);
            }
            return this;
        }
        i();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            g(obj);
        }
        return this;
    }

    public final void i() {
        if (this.f18678a) {
        } else {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
