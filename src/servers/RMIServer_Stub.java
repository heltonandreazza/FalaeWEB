package servers;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.rmi.UnexpectedException;
import java.rmi.server.RemoteRef;
import java.rmi.server.RemoteStub;

public final class RMIServer_Stub
extends RemoteStub
implements RMIServerAPI {
    private static final long serialVersionUID = 2;
    private static Method $method_deleteGroup_0;
    private static Method $method_deleteLog_1;
    private static Method $method_deleteUser_2;
    private static Method $method_getGroups_3;
    private static Method $method_getLogs_4;
    private static Method $method_getUser_5;
    private static Method $method_getUsers_6;
    private static Method $method_loadGroupsFile_7;
    private static Method $method_loadLogsFile_8;
    private static Method $method_loadUsersFile_9;
    private static Method $method_postGroup_10;
    private static Method $method_postLog_11;
    private static Method $method_postUser_12;
    private static Method $method_writeGroupsFile_13;
    private static Method $method_writeLogsFile_14;
    private static Method $method_writeUsersFile_15;
    static /* synthetic */ Class class$servers$RMIServerAPI;
    static /* synthetic */ Class class$java$lang$String;

    static {
        try {
            Class class_ = class$servers$RMIServerAPI != null ? class$servers$RMIServerAPI : (RMIServer_Stub.class$servers$RMIServerAPI = RMIServer_Stub.class$("servers.RMIServerAPI"));
            Class[] arrclass = new Class[2];
            Class class_2 = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            arrclass[0] = class_2;
            arrclass[1] = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            $method_deleteGroup_0 = class_.getMethod("deleteGroup", arrclass);
            Class[] arrclass2 = new Class[1];
            arrclass2[0] = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            $method_deleteLog_1 = (class$servers$RMIServerAPI != null ? class$servers$RMIServerAPI : (RMIServer_Stub.class$servers$RMIServerAPI = RMIServer_Stub.class$("servers.RMIServerAPI"))).getMethod("deleteLog", arrclass2);
            Class[] arrclass3 = new Class[2];
            arrclass3[0] = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            arrclass3[1] = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            $method_deleteUser_2 = (class$servers$RMIServerAPI != null ? class$servers$RMIServerAPI : (RMIServer_Stub.class$servers$RMIServerAPI = RMIServer_Stub.class$("servers.RMIServerAPI"))).getMethod("deleteUser", arrclass3);
            Class[] arrclass4 = new Class[1];
            arrclass4[0] = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            $method_getGroups_3 = (class$servers$RMIServerAPI != null ? class$servers$RMIServerAPI : (RMIServer_Stub.class$servers$RMIServerAPI = RMIServer_Stub.class$("servers.RMIServerAPI"))).getMethod("getGroups", arrclass4);
            $method_getLogs_4 = (class$servers$RMIServerAPI != null ? class$servers$RMIServerAPI : (RMIServer_Stub.class$servers$RMIServerAPI = RMIServer_Stub.class$("servers.RMIServerAPI"))).getMethod("getLogs", new Class[0]);
            Class[] arrclass5 = new Class[2];
            arrclass5[0] = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            arrclass5[1] = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            $method_getUser_5 = (class$servers$RMIServerAPI != null ? class$servers$RMIServerAPI : (RMIServer_Stub.class$servers$RMIServerAPI = RMIServer_Stub.class$("servers.RMIServerAPI"))).getMethod("getUser", arrclass5);
            $method_getUsers_6 = (class$servers$RMIServerAPI != null ? class$servers$RMIServerAPI : (RMIServer_Stub.class$servers$RMIServerAPI = RMIServer_Stub.class$("servers.RMIServerAPI"))).getMethod("getUsers", new Class[0]);
            $method_loadGroupsFile_7 = (class$servers$RMIServerAPI != null ? class$servers$RMIServerAPI : (RMIServer_Stub.class$servers$RMIServerAPI = RMIServer_Stub.class$("servers.RMIServerAPI"))).getMethod("loadGroupsFile", new Class[0]);
            $method_loadLogsFile_8 = (class$servers$RMIServerAPI != null ? class$servers$RMIServerAPI : (RMIServer_Stub.class$servers$RMIServerAPI = RMIServer_Stub.class$("servers.RMIServerAPI"))).getMethod("loadLogsFile", new Class[0]);
            $method_loadUsersFile_9 = (class$servers$RMIServerAPI != null ? class$servers$RMIServerAPI : (RMIServer_Stub.class$servers$RMIServerAPI = RMIServer_Stub.class$("servers.RMIServerAPI"))).getMethod("loadUsersFile", new Class[0]);
            Class[] arrclass6 = new Class[6];
            arrclass6[0] = Integer.TYPE;
            arrclass6[1] = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            arrclass6[2] = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            arrclass6[3] = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            arrclass6[4] = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            arrclass6[5] = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            $method_postGroup_10 = (class$servers$RMIServerAPI != null ? class$servers$RMIServerAPI : (RMIServer_Stub.class$servers$RMIServerAPI = RMIServer_Stub.class$("servers.RMIServerAPI"))).getMethod("postGroup", arrclass6);
            Class[] arrclass7 = new Class[3];
            arrclass7[0] = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            arrclass7[1] = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            arrclass7[2] = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            $method_postLog_11 = (class$servers$RMIServerAPI != null ? class$servers$RMIServerAPI : (RMIServer_Stub.class$servers$RMIServerAPI = RMIServer_Stub.class$("servers.RMIServerAPI"))).getMethod("postLog", arrclass7);
            Class[] arrclass8 = new Class[3];
            arrclass8[0] = Integer.TYPE;
            arrclass8[1] = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            arrclass8[2] = class$java$lang$String != null ? class$java$lang$String : (RMIServer_Stub.class$java$lang$String = RMIServer_Stub.class$("java.lang.String"));
            $method_postUser_12 = (class$servers$RMIServerAPI != null ? class$servers$RMIServerAPI : (RMIServer_Stub.class$servers$RMIServerAPI = RMIServer_Stub.class$("servers.RMIServerAPI"))).getMethod("postUser", arrclass8);
            $method_writeGroupsFile_13 = (class$servers$RMIServerAPI != null ? class$servers$RMIServerAPI : (RMIServer_Stub.class$servers$RMIServerAPI = RMIServer_Stub.class$("servers.RMIServerAPI"))).getMethod("writeGroupsFile", new Class[0]);
            $method_writeLogsFile_14 = (class$servers$RMIServerAPI != null ? class$servers$RMIServerAPI : (RMIServer_Stub.class$servers$RMIServerAPI = RMIServer_Stub.class$("servers.RMIServerAPI"))).getMethod("writeLogsFile", new Class[0]);
            $method_writeUsersFile_15 = (class$servers$RMIServerAPI != null ? class$servers$RMIServerAPI : (RMIServer_Stub.class$servers$RMIServerAPI = RMIServer_Stub.class$("servers.RMIServerAPI"))).getMethod("writeUsersFile", new Class[0]);
        }
        catch (NoSuchMethodException v10) {
            throw new NoSuchMethodError("stub class initialization failed");
        }
    }

    public RMIServer_Stub(RemoteRef remoteRef) {
        super(remoteRef);
    }

    static /* synthetic */ Class class$(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException var1_1) {
            throw new NoClassDefFoundError(var1_1.getMessage());
        }
    }

    public String deleteGroup(String string, String string2) throws RemoteException {
        try {
            Object object = this.ref.invoke(this, $method_deleteGroup_0, new Object[]{string, string2}, -5173561362872384472L);
            return (String)object;
        }
        catch (RuntimeException var3_4) {
            throw var3_4;
        }
        catch (RemoteException var3_5) {
            throw var3_5;
        }
        catch (Exception var3_6) {
            throw new UnexpectedException("undeclared checked exception", var3_6);
        }
    }

    public String deleteLog(String string) throws RemoteException {
        try {
            Object object = this.ref.invoke(this, $method_deleteLog_1, new Object[]{string}, 3897375686559920354L);
            return (String)object;
        }
        catch (RuntimeException var2_3) {
            throw var2_3;
        }
        catch (RemoteException var2_4) {
            throw var2_4;
        }
        catch (Exception var2_5) {
            throw new UnexpectedException("undeclared checked exception", var2_5);
        }
    }

    public String deleteUser(String string, String string2) throws RemoteException {
        try {
            Object object = this.ref.invoke(this, $method_deleteUser_2, new Object[]{string, string2}, -379261931645718037L);
            return (String)object;
        }
        catch (RuntimeException var3_4) {
            throw var3_4;
        }
        catch (RemoteException var3_5) {
            throw var3_5;
        }
        catch (Exception var3_6) {
            throw new UnexpectedException("undeclared checked exception", var3_6);
        }
    }

    public String getGroups(String string) throws RemoteException {
        try {
            Object object = this.ref.invoke(this, $method_getGroups_3, new Object[]{string}, 3118760680113072869L);
            return (String)object;
        }
        catch (RuntimeException var2_3) {
            throw var2_3;
        }
        catch (RemoteException var2_4) {
            throw var2_4;
        }
        catch (Exception var2_5) {
            throw new UnexpectedException("undeclared checked exception", var2_5);
        }
    }

    public String getLogs() throws RemoteException {
        try {
            Object object = this.ref.invoke(this, $method_getLogs_4, null, 2060969487842619489L);
            return (String)object;
        }
        catch (RuntimeException var1_2) {
            throw var1_2;
        }
        catch (RemoteException var1_3) {
            throw var1_3;
        }
        catch (Exception var1_4) {
            throw new UnexpectedException("undeclared checked exception", var1_4);
        }
    }

    public String getUser(String string, String string2) throws RemoteException {
        try {
            Object object = this.ref.invoke(this, $method_getUser_5, new Object[]{string, string2}, 4075782814390654278L);
            return (String)object;
        }
        catch (RuntimeException var3_4) {
            throw var3_4;
        }
        catch (RemoteException var3_5) {
            throw var3_5;
        }
        catch (Exception var3_6) {
            throw new UnexpectedException("undeclared checked exception", var3_6);
        }
    }

    public String getUsers() throws RemoteException {
        try {
            Object object = this.ref.invoke(this, $method_getUsers_6, null, 3665504803394094350L);
            return (String)object;
        }
        catch (RuntimeException var1_2) {
            throw var1_2;
        }
        catch (RemoteException var1_3) {
            throw var1_3;
        }
        catch (Exception var1_4) {
            throw new UnexpectedException("undeclared checked exception", var1_4);
        }
    }

    public void loadGroupsFile() throws RemoteException {
        try {
            this.ref.invoke(this, $method_loadGroupsFile_7, null, 2222152867738849378L);
        }
        catch (RuntimeException var1_1) {
            throw var1_1;
        }
        catch (RemoteException var1_2) {
            throw var1_2;
        }
        catch (Exception var1_3) {
            throw new UnexpectedException("undeclared checked exception", var1_3);
        }
    }

    public void loadLogsFile() throws RemoteException {
        try {
            this.ref.invoke(this, $method_loadLogsFile_8, null, 8914799928916337190L);
        }
        catch (RuntimeException var1_1) {
            throw var1_1;
        }
        catch (RemoteException var1_2) {
            throw var1_2;
        }
        catch (Exception var1_3) {
            throw new UnexpectedException("undeclared checked exception", var1_3);
        }
    }

    public void loadUsersFile() throws RemoteException {
        try {
            this.ref.invoke(this, $method_loadUsersFile_9, null, -8428215806196557003L);
        }
        catch (RuntimeException var1_1) {
            throw var1_1;
        }
        catch (RemoteException var1_2) {
            throw var1_2;
        }
        catch (Exception var1_3) {
            throw new UnexpectedException("undeclared checked exception", var1_3);
        }
    }

    public String postGroup(int n, String string, String string2, String string3, String string4, String string5) throws RemoteException {
        try {
            Object object = this.ref.invoke(this, $method_postGroup_10, new Object[]{new Integer(n), string, string2, string3, string4, string5}, 3062175713374496472L);
            return (String)object;
        }
        catch (RuntimeException var7_8) {
            throw var7_8;
        }
        catch (RemoteException var7_9) {
            throw var7_9;
        }
        catch (Exception var7_10) {
            throw new UnexpectedException("undeclared checked exception", var7_10);
        }
    }

    public String postLog(String string, String string2, String string3) throws RemoteException {
        try {
            Object object = this.ref.invoke(this, $method_postLog_11, new Object[]{string, string2, string3}, 7632864665749247977L);
            return (String)object;
        }
        catch (RuntimeException var4_5) {
            throw var4_5;
        }
        catch (RemoteException var4_6) {
            throw var4_6;
        }
        catch (Exception var4_7) {
            throw new UnexpectedException("undeclared checked exception", var4_7);
        }
    }

    public String postUser(int n, String string, String string2) throws RemoteException {
        try {
            Object object = this.ref.invoke(this, $method_postUser_12, new Object[]{new Integer(n), string, string2}, 208692496362488595L);
            return (String)object;
        }
        catch (RuntimeException var4_5) {
            throw var4_5;
        }
        catch (RemoteException var4_6) {
            throw var4_6;
        }
        catch (Exception var4_7) {
            throw new UnexpectedException("undeclared checked exception", var4_7);
        }
    }

    public void writeGroupsFile() throws RemoteException {
        try {
            this.ref.invoke(this, $method_writeGroupsFile_13, null, -4063824126688741945L);
        }
        catch (RuntimeException var1_1) {
            throw var1_1;
        }
        catch (RemoteException var1_2) {
            throw var1_2;
        }
        catch (Exception var1_3) {
            throw new UnexpectedException("undeclared checked exception", var1_3);
        }
    }

    public void writeLogsFile() throws RemoteException {
        try {
            this.ref.invoke(this, $method_writeLogsFile_14, null, 8789672278232223848L);
        }
        catch (RuntimeException var1_1) {
            throw var1_1;
        }
        catch (RemoteException var1_2) {
            throw var1_2;
        }
        catch (Exception var1_3) {
            throw new UnexpectedException("undeclared checked exception", var1_3);
        }
    }

    public void writeUsersFile() throws RemoteException {
        try {
            this.ref.invoke(this, $method_writeUsersFile_15, null, -5429800351363843585L);
        }
        catch (RuntimeException var1_1) {
            throw var1_1;
        }
        catch (RemoteException var1_2) {
            throw var1_2;
        }
        catch (Exception var1_3) {
            throw new UnexpectedException("undeclared checked exception", var1_3);
        }
    }
}