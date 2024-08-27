package hv;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.util.regex.Pattern;
import org.threeten.bp.zone.ZoneRulesException;

/* loaded from: classes2.dex */
public final class s extends q {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f18766d = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: b, reason: collision with root package name */
    public final String f18767b;

    /* renamed from: c, reason: collision with root package name */
    public final transient mv.h f18768c;

    public s(String str, mv.h hVar) {
        this.f18767b = str;
        this.f18768c = hVar;
    }

    public static s r(String str, boolean z10) {
        mv.h hVar;
        if (str.length() >= 2 && f18766d.matcher(str).matches()) {
            try {
                hVar = mv.d.a(str);
            } catch (ZoneRulesException e10) {
                if (str.equals("GMT0")) {
                    r rVar = r.f18761f;
                    rVar.getClass();
                    hVar = new mv.g(rVar);
                } else if (!z10) {
                    hVar = null;
                } else {
                    throw e10;
                }
            }
            return new s(str, hVar);
        }
        throw new RuntimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 7, this);
    }

    @Override // hv.q
    public final String m() {
        return this.f18767b;
    }

    @Override // hv.q
    public final mv.h n() {
        mv.h hVar = this.f18768c;
        if (hVar == null) {
            return mv.d.a(this.f18767b);
        }
        return hVar;
    }

    @Override // hv.q
    public final void q(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f18767b);
    }
}
