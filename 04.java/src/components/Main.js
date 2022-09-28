import Nav from "../components/Nav";
import Footer from "../components/Footer";
import styles from "./Main.module.css";
import "./Main.font.css";
import { Outlet } from "react-router-dom";

// function Main({ children }) {
function Main() {
    return (
        <>
            <Nav className={styles.nav} />
            <div className={styles.body}>
                <Outlet />
            </div>
            <Footer className={styles.footer} />
        </>
    );
}

export default Main;
