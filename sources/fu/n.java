package fu;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d4.t1;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class n {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [pu.a] */
    public static final ArrayList a(BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        ArrayList arrayList = new ArrayList();
        m action = new m(arrayList);
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
            t1 t1Var = new t1(bufferedReader);
            Intrinsics.checkNotNullParameter(t1Var, "<this>");
            if (!(t1Var instanceof pu.a)) {
                t1Var = new pu.a(t1Var);
            }
            Iterator it = t1Var.iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.f23355a;
            yk.g.k(bufferedReader, null);
            return arrayList;
        } finally {
        }
    }

    public static final String b(Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        StringWriter out = new StringWriter();
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        int read = reader.read(cArr);
        while (read >= 0) {
            out.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter = out.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter, "toString(...)");
        return stringWriter;
    }
}
